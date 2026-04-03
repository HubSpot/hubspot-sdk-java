// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.marketingevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SearchPublicResponseWrapperTest {

    @Test
    fun create() {
        val searchPublicResponseWrapper =
            SearchPublicResponseWrapper.builder()
                .appId(0)
                .externalAccountId("externalAccountId")
                .externalEventId("externalEventId")
                .objectId("objectId")
                .build()

        assertThat(searchPublicResponseWrapper.appId()).isEqualTo(0)
        assertThat(searchPublicResponseWrapper.externalAccountId()).isEqualTo("externalAccountId")
        assertThat(searchPublicResponseWrapper.externalEventId()).isEqualTo("externalEventId")
        assertThat(searchPublicResponseWrapper.objectId()).isEqualTo("objectId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val searchPublicResponseWrapper =
            SearchPublicResponseWrapper.builder()
                .appId(0)
                .externalAccountId("externalAccountId")
                .externalEventId("externalEventId")
                .objectId("objectId")
                .build()

        val roundtrippedSearchPublicResponseWrapper =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(searchPublicResponseWrapper),
                jacksonTypeRef<SearchPublicResponseWrapper>(),
            )

        assertThat(roundtrippedSearchPublicResponseWrapper).isEqualTo(searchPublicResponseWrapper)
    }
}
