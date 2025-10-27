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
                .recordIdsToAdd(listOf("123", "456", "789"))
                .addRecordIdsToRemove("654")
                .build()

        assertThat(membershipChangeRequest.recordIdsToAdd()).containsExactly("123", "456", "789")
        assertThat(membershipChangeRequest.recordIdsToRemove()).containsExactly("654")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val membershipChangeRequest =
            MembershipChangeRequest.builder()
                .recordIdsToAdd(listOf("123", "456", "789"))
                .addRecordIdsToRemove("654")
                .build()

        val roundtrippedMembershipChangeRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(membershipChangeRequest),
                jacksonTypeRef<MembershipChangeRequest>(),
            )

        assertThat(roundtrippedMembershipChangeRequest).isEqualTo(membershipChangeRequest)
    }
}
