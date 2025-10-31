// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicAllHistoryRefineByTest {

    @Test
    fun create() {
        val publicAllHistoryRefineBy =
            PublicAllHistoryRefineBy.builder()
                .type(PublicAllHistoryRefineBy.Type.ALL_HISTORY)
                .build()

        assertThat(publicAllHistoryRefineBy.type())
            .isEqualTo(PublicAllHistoryRefineBy.Type.ALL_HISTORY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicAllHistoryRefineBy =
            PublicAllHistoryRefineBy.builder()
                .type(PublicAllHistoryRefineBy.Type.ALL_HISTORY)
                .build()

        val roundtrippedPublicAllHistoryRefineBy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicAllHistoryRefineBy),
                jacksonTypeRef<PublicAllHistoryRefineBy>(),
            )

        assertThat(roundtrippedPublicAllHistoryRefineBy).isEqualTo(publicAllHistoryRefineBy)
    }
}
