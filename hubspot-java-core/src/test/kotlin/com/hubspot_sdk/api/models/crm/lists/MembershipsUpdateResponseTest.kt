// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MembershipsUpdateResponseTest {

    @Test
    fun create() {
        val membershipsUpdateResponse =
            MembershipsUpdateResponse.builder()
                .addRecordIdsMissing("string")
                .addRecordIdsRemoved("string")
                .addRecordsIdsAdded("string")
                .build()

        assertThat(membershipsUpdateResponse.recordIdsMissing()).containsExactly("string")
        assertThat(membershipsUpdateResponse.recordIdsRemoved()).containsExactly("string")
        assertThat(membershipsUpdateResponse.recordsIdsAdded()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val membershipsUpdateResponse =
            MembershipsUpdateResponse.builder()
                .addRecordIdsMissing("string")
                .addRecordIdsRemoved("string")
                .addRecordsIdsAdded("string")
                .build()

        val roundtrippedMembershipsUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(membershipsUpdateResponse),
                jacksonTypeRef<MembershipsUpdateResponse>(),
            )

        assertThat(roundtrippedMembershipsUpdateResponse).isEqualTo(membershipsUpdateResponse)
    }
}
