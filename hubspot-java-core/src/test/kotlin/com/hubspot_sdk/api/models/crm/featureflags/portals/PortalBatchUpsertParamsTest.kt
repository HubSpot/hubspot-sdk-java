// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.featureflags.portals

import com.hubspot_sdk.api.models.crm.featureflags.BatchPortalEntry
import com.hubspot_sdk.api.models.crm.featureflags.PortalFlagStateBatchPutRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortalBatchUpsertParamsTest {

    @Test
    fun create() {
        PortalBatchUpsertParams.builder()
            .appId(0)
            .flagName("flagName")
            .portalFlagStateBatchPutRequest(
                PortalFlagStateBatchPutRequest.builder()
                    .addPortalState(
                        BatchPortalEntry.builder()
                            .flagState(BatchPortalEntry.FlagState.ABSENT)
                            .portalId(0)
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PortalBatchUpsertParams.builder()
                .appId(0)
                .flagName("flagName")
                .portalFlagStateBatchPutRequest(
                    PortalFlagStateBatchPutRequest.builder()
                        .addPortalState(
                            BatchPortalEntry.builder()
                                .flagState(BatchPortalEntry.FlagState.ABSENT)
                                .portalId(0)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("flagName")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PortalBatchUpsertParams.builder()
                .appId(0)
                .flagName("flagName")
                .portalFlagStateBatchPutRequest(
                    PortalFlagStateBatchPutRequest.builder()
                        .addPortalState(
                            BatchPortalEntry.builder()
                                .flagState(BatchPortalEntry.FlagState.ABSENT)
                                .portalId(0)
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PortalFlagStateBatchPutRequest.builder()
                    .addPortalState(
                        BatchPortalEntry.builder()
                            .flagState(BatchPortalEntry.FlagState.ABSENT)
                            .portalId(0)
                            .build()
                    )
                    .build()
            )
    }
}
