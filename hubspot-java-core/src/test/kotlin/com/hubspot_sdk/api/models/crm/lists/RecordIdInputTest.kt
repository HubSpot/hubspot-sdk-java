// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecordIdInputTest {

    @Test
    fun create() {
        val recordIdInput =
            RecordIdInput.builder().objectTypeId("objectTypeId").recordId("recordId").build()

        assertThat(recordIdInput.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(recordIdInput.recordId()).isEqualTo("recordId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val recordIdInput =
            RecordIdInput.builder().objectTypeId("objectTypeId").recordId("recordId").build()

        val roundtrippedRecordIdInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(recordIdInput),
                jacksonTypeRef<RecordIdInput>(),
            )

        assertThat(roundtrippedRecordIdInput).isEqualTo(recordIdInput)
    }
}
