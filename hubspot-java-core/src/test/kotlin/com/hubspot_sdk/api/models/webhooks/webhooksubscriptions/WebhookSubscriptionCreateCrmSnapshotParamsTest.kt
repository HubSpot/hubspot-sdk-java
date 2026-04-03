// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks.webhooksubscriptions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookSubscriptionCreateCrmSnapshotParamsTest {

    @Test
    fun create() {
        WebhookSubscriptionCreateCrmSnapshotParams.builder()
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
            WebhookSubscriptionCreateCrmSnapshotParams.builder()
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
