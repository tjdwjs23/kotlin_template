package test.example.tokenapi.token.entity

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TokenRepository : JpaRepository<Token, Long>
