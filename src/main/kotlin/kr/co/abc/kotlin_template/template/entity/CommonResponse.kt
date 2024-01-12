package kr.co.abc.kotlin_template.template.entity


data class CommonResponse<T, M>(
    val type: Any,
    val message: M,
)
