// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.featureflags

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortalFlagStateBatchPutRequestTest {

    @Test
    fun create() {
        val portalFlagStateBatchPutRequest =
            PortalFlagStateBatchPutRequest.builder()
                .addPortalState(
                    BatchPortalEntry.builder()
                        .flagState(BatchPortalEntry.FlagState.ABSENT)
                        .portalId(0)
                        .build()
                )
                .build()

        assertThat(portalFlagStateBatchPutRequest.portalStates())
            .containsExactly(
                BatchPortalEntry.builder()
                    .flagState(BatchPortalEntry.FlagState.ABSENT)
                    .portalId(0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portalFlagStateBatchPutRequest =
            PortalFlagStateBatchPutRequest.builder()
                .addPortalState(
                    BatchPortalEntry.builder()
                        .flagState(BatchPortalEntry.FlagState.ABSENT)
                        .portalId(0)
                        .build()
                )
                .build()

        val roundtrippedPortalFlagStateBatchPutRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portalFlagStateBatchPutRequest),
                jacksonTypeRef<PortalFlagStateBatchPutRequest>(),
            )

        assertThat(roundtrippedPortalFlagStateBatchPutRequest)
            .isEqualTo(portalFlagStateBatchPutRequest)
    }
}
