package chapter11_dsl

data class Issue(
        val id: String, val project: String, val type: String,
        val priority: String, val description: String
)

class ImportantIssuesPredicate(val project: String) : (Issue) -> Boolean {
    override operator fun invoke(issue: Issue) : Boolean {
        return issue.project == project && issue.isImportant()
    }

    private fun Issue.isImportant() : Boolean {
        return type == "Bug" &&
                (priority == "Major" || priority == "Critical")
    }
}

fun main(args: Array<String>) {
    val i1 = Issue("IDEA-111", "IDEA", "Bug", "Major",
            "Save settings")
    val i2 = Issue("KT-1234", "Kotlin", "Feature", "Normal",
            "Intention: ")
    val predicate = ImportantIssuesPredicate("IDEA")

    for (issue in listOf(i1, i2).filter(predicate))
        println(issue.id)
}