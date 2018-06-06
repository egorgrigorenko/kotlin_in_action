package chapter02_kotlin_basics.exercises

class Advert(val sdocid: String,
             val propAdvertSourceId: Int,
             val propAdvertGeo: String,
             val sdocstatus: Int,
             propDealerExternalId: String?) : Comparable<Advert> {

    override fun compareTo(other: Advert) = sdocid.compareTo(other.sdocid)

}

interface AdvertSpecification {
    fun isSatisfyBy(advert: Advert): Boolean
}

class And(private val specifications: ArrayList<AdvertSpecification>):
        AdvertSpecification {

    override fun isSatisfyBy(advert: Advert): Boolean {
        for(spec in specifications)
            if (!spec.isSatisfyBy(advert))
                return false
        return true
    }

    fun and(other: AdvertSpecification) = when (other) {
        is And -> specifications.addAll(other.specifications)
        else -> specifications.add(other)
    }
}