// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.lists

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListAddAndRemoveMembershipsParamsTest {

    @Test
    fun create() {
        ListAddAndRemoveMembershipsParams.builder()
            .listId("listId")
            .membershipChangeRequest(
                MembershipChangeRequest.builder()
                    .addRecordIdsToAdd("string")
                    .addRecordIdsToRemove("string")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ListAddAndRemoveMembershipsParams.builder()
                .listId("listId")
                .membershipChangeRequest(
                    MembershipChangeRequest.builder()
                        .addRecordIdsToAdd("string")
                        .addRecordIdsToRemove("string")
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
            ListAddAndRemoveMembershipsParams.builder()
                .listId("listId")
                .membershipChangeRequest(
                    MembershipChangeRequest.builder()
                        .addRecordIdsToAdd("string")
                        .addRecordIdsToRemove("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                MembershipChangeRequest.builder()
                    .addRecordIdsToAdd("string")
                    .addRecordIdsToRemove("string")
                    .build()
            )
    }
}
