// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListBatchReadMembershipsParamsTest {

    @Test
    fun create() {
        ListBatchReadMembershipsParams.builder()
            .batchInputRecordIdInput(
                BatchInputRecordIdInput.builder()
                    .addInput(
                        RecordIdInput.builder()
                            .objectTypeId("objectTypeId")
                            .recordId("recordId")
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ListBatchReadMembershipsParams.builder()
                .batchInputRecordIdInput(
                    BatchInputRecordIdInput.builder()
                        .addInput(
                            RecordIdInput.builder()
                                .objectTypeId("objectTypeId")
                                .recordId("recordId")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputRecordIdInput.builder()
                    .addInput(
                        RecordIdInput.builder()
                            .objectTypeId("objectTypeId")
                            .recordId("recordId")
                            .build()
                    )
                    .build()
            )
    }
}
