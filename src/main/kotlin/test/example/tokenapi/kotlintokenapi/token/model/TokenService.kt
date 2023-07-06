package test.example.tokenapi.token.model

import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.stereotype.Service
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext
import java.util.*
import test.example.tokenapi.token.entity.Token
import test.example.tokenapi.token.entity.QToken


@Service
class TokenService {

    @PersistenceContext
    private lateinit var entityManager: EntityManager

    fun findToken(token_type: String?, token_name: String?): List<Token> {
        val builder = JPAQueryFactory(entityManager)
        val token = QToken.token
        val query = builder.selectFrom(token)

        if (!token_type.isNullOrEmpty()) {
            query.where(
                token.token_type.eq(token_type)
                    .andAnyOf(
                        token.token_name.contains(token_name)
                            .or(token.token_symbol.contains(token_name))
                            .or(token.token_contract.contains(token_name))
                    )
            )
        }

        return query.fetch()
    }

    fun findTokenContract(token_type: String?, token_name: String?): Token? {
        val builder = JPAQueryFactory(entityManager)
        val token = QToken.token
        val query = builder.selectFrom(token)
            .where(token.token_type.eq(token_type), token.token_name.eq(token_name))

        return query.fetchOne()
    }


}
