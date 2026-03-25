// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MembershipChangeRequestTest {

    @Test
    fun create() {
        val membershipChangeRequest =
            MembershipChangeRequest.builder()
                .addRecordIdsToAdd("string")
                .addRecordIdsToRemove("string")
                .build()

        assertThat(membershipChangeRequest.recordIdsToAdd()).containsExactly("string")
        assertThat(membershipChangeRequest.recordIdsToRemove()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val membershipChangeRequest =
            MembershipChangeRequest.builder()
                .addRecordIdsToAdd("string")
                .addRecordIdsToRemove("string")
                .build()

        val roundtrippedMembershipChangeRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(membershipChangeRequest),
                jacksonTypeRef<MembershipChangeRequest>(),
            )

        assertThat(roundtrippedMembershipChangeRequest).isEqualTo(membershipChangeRequest)
    }
}
