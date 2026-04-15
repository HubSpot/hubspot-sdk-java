// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputRecordIdInputTest {

    @Test
    fun create() {
        val batchInputRecordIdInput =
            BatchInputRecordIdInput.builder()
                .addInput(
                    RecordIdInput.builder()
                        .objectTypeId("objectTypeId")
                        .recordId("recordId")
                        .build()
                )
                .build()

        assertThat(batchInputRecordIdInput.inputs())
            .containsExactly(
                RecordIdInput.builder().objectTypeId("objectTypeId").recordId("recordId").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputRecordIdInput =
            BatchInputRecordIdInput.builder()
                .addInput(
                    RecordIdInput.builder()
                        .objectTypeId("objectTypeId")
                        .recordId("recordId")
                        .build()
                )
                .build()

        val roundtrippedBatchInputRecordIdInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputRecordIdInput),
                jacksonTypeRef<BatchInputRecordIdInput>(),
            )

        assertThat(roundtrippedBatchInputRecordIdInput).isEqualTo(batchInputRecordIdInput)
    }
}
