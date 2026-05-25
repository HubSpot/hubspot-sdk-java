// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.webhooksjournal.snapshots

import com.hubspot.sdk.models.CrmObjectSnapshotBatchRequest
import com.hubspot.sdk.models.CrmObjectSnapshotRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SnapshotCreateParamsTest {

    @Test
    fun create() {
        SnapshotCreateParams.builder()
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
            SnapshotCreateParams.builder()
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
