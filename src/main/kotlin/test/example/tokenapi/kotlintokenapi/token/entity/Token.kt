package test.example.tokenapi.token.entity

import javax.persistence.*

@Entity
@Table(name = "token")
data class Token(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "token_idx")
    var id: Long? = null,
    var token_type: String? = null,
    var token_contract: String? = null,
    var token_name: String? = null,
    var token_img: String? = null,
    var token_symbol: String? = null,
    var token_decimals: String? = null
)


