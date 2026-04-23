// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.webhooks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookCreateCrmSnapshotsParamsTest {

    @Test
    fun create() {
        WebhookCreateCrmSnapshotsParams.builder()
            .crmObjectSnapshotBatchRequest(
                CrmObjectSnapshotBatchRequest.builder()
                    .addSnapshotRequest(
                        CrmObjectSnapshotRequest.builder()
                            .objectId(0L)
                            .objectTypeId("objectTypeId")
                            .portalId(0L)
                            .addProperty("string")
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            WebhookCreateCrmSnapshotsParams.builder()
                .crmObjectSnapshotBatchRequest(
                    CrmObjectSnapshotBatchRequest.builder()
                        .addSnapshotRequest(
                            CrmObjectSnapshotRequest.builder()
                                .objectId(0L)
                                .objectTypeId("objectTypeId")
                                .portalId(0L)
                                .addProperty("string")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CrmObjectSnapshotBatchRequest.builder()
                    .addSnapshotRequest(
                        CrmObjectSnapshotRequest.builder()
                            .objectId(0L)
                            .objectTypeId("objectTypeId")
                            .portalId(0L)
                            .addProperty("string")
                            .build()
                    )
                    .build()
            )
    }
}
