// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JoinTimeAndRecordIdTest {

    @Test
    fun create() {
        val joinTimeAndRecordId =
            JoinTimeAndRecordId.builder()
                .membershipTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .recordId("recordId")
                .build()

        assertThat(joinTimeAndRecordId.membershipTimestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(joinTimeAndRecordId.recordId()).isEqualTo("recordId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val joinTimeAndRecordId =
            JoinTimeAndRecordId.builder()
                .membershipTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .recordId("recordId")
                .build()

        val roundtrippedJoinTimeAndRecordId =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(joinTimeAndRecordId),
                jacksonTypeRef<JoinTimeAndRecordId>(),
            )

        assertThat(roundtrippedJoinTimeAndRecordId).isEqualTo(joinTimeAndRecordId)
    }
}
