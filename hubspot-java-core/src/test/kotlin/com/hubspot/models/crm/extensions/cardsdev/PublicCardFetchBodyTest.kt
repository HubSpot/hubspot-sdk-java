// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.extensions.cardsdev

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicCardFetchBodyTest {

    @Test
    fun create() {
        val publicCardFetchBody =
            PublicCardFetchBody.builder()
                .addObjectType(
                    CardObjectTypeBody.builder()
                        .name(CardObjectTypeBody.Name.COMPANIES)
                        .addPropertiesToSend("string")
                        .build()
                )
                .targetUrl("targetUrl")
                .build()

        assertThat(publicCardFetchBody.objectTypes())
            .containsExactly(
                CardObjectTypeBody.builder()
                    .name(CardObjectTypeBody.Name.COMPANIES)
                    .addPropertiesToSend("string")
                    .build()
            )
        assertThat(publicCardFetchBody.targetUrl()).isEqualTo("targetUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicCardFetchBody =
            PublicCardFetchBody.builder()
                .addObjectType(
                    CardObjectTypeBody.builder()
                        .name(CardObjectTypeBody.Name.COMPANIES)
                        .addPropertiesToSend("string")
                        .build()
                )
                .targetUrl("targetUrl")
                .build()

        val roundtrippedPublicCardFetchBody =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicCardFetchBody),
                jacksonTypeRef<PublicCardFetchBody>(),
            )

        assertThat(roundtrippedPublicCardFetchBody).isEqualTo(publicCardFetchBody)
    }
}
