// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists.memberships

import com.hubspot_sdk.api.models.crm.lists.MembershipChangeRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MembershipAddAndRemoveParamsTest {

    @Test
    fun create() {
        MembershipAddAndRemoveParams.builder()
            .listId("listId")
            .membershipChangeRequest(
                MembershipChangeRequest.builder()
                    .recordIdsToAdd(listOf("123", "456", "789"))
                    .addRecordIdsToRemove("654")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MembershipAddAndRemoveParams.builder()
                .listId("listId")
                .membershipChangeRequest(
                    MembershipChangeRequest.builder()
                        .recordIdsToAdd(listOf("123", "456", "789"))
                        .addRecordIdsToRemove("654")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("listId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MembershipAddAndRemoveParams.builder()
                .listId("listId")
                .membershipChangeRequest(
                    MembershipChangeRequest.builder()
                        .recordIdsToAdd(listOf("123", "456", "789"))
                        .addRecordIdsToRemove("654")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                MembershipChangeRequest.builder()
                    .recordIdsToAdd(listOf("123", "456", "789"))
                    .addRecordIdsToRemove("654")
                    .build()
            )
    }
}
