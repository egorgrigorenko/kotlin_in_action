package chapter05_programming_with_lambdas;

import chapter03_functions.View;

interface OnClickInterface {
    void onClick(View v);
}

public class p5_4_0_JavaButton {
    public void setOnClickListener(OnClickInterface oci) {
        oci.onClick(new View());
    }
}
