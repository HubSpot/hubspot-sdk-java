// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.subscriptions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UnpauseRequestTest {

    @Test
    fun create() {
        val unpauseRequest = UnpauseRequest.builder().proposedNextBillingDate(0L).build()

        assertThat(unpauseRequest.proposedNextBillingDate()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val unpauseRequest = UnpauseRequest.builder().proposedNextBillingDate(0L).build()

        val roundtrippedUnpauseRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unpauseRequest),
                jacksonTypeRef<UnpauseRequest>(),
            )

        assertThat(roundtrippedUnpauseRequest).isEqualTo(unpauseRequest)
    }
}
