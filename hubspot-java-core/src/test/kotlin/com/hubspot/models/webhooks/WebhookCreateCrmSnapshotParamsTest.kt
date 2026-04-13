// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.webhooks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookCreateCrmSnapshotParamsTest {

    @Test
    fun create() {
        WebhookCreateCrmSnapshotParams.builder()
            .crmObjectSnapshotBatchRequest(
                CrmObjectSnapshotBatchRequest.builder()
                    .addSnapshotRequest(
                        CrmObjectSnapshotRequest.builder()
                            .objectId(0)
                            .objectTypeId("objectTypeId")
                            .portalId(0)
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
            WebhookCreateCrmSnapshotParams.builder()
                .crmObjectSnapshotBatchRequest(
                    CrmObjectSnapshotBatchRequest.builder()
                        .addSnapshotRequest(
                            CrmObjectSnapshotRequest.builder()
                                .objectId(0)
                                .objectTypeId("objectTypeId")
                                .portalId(0)
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
                            .objectId(0)
                            .objectTypeId("objectTypeId")
                            .portalId(0)
                            .addProperty("string")
                            .build()
                    )
                    .build()
            )
    }
}
