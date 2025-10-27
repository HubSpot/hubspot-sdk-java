// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicThreadUpdateRequestTest {

    @Test
    fun create() {
        val publicThreadUpdateRequest =
            PublicThreadUpdateRequest.builder()
                .archived(true)
                .status(PublicThreadUpdateRequest.Status.OPEN)
                .build()

        assertThat(publicThreadUpdateRequest.archived()).contains(true)
        assertThat(publicThreadUpdateRequest.status())
            .contains(PublicThreadUpdateRequest.Status.OPEN)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicThreadUpdateRequest =
            PublicThreadUpdateRequest.builder()
                .archived(true)
                .status(PublicThreadUpdateRequest.Status.OPEN)
                .build()

        val roundtrippedPublicThreadUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicThreadUpdateRequest),
                jacksonTypeRef<PublicThreadUpdateRequest>(),
            )

        assertThat(roundtrippedPublicThreadUpdateRequest).isEqualTo(publicThreadUpdateRequest)
    }
}
