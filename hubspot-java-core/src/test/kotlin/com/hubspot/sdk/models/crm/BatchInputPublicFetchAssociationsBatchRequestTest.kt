// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputPublicFetchAssociationsBatchRequestTest {

    @Test
    fun create() {
        val batchInputPublicFetchAssociationsBatchRequest =
            BatchInputPublicFetchAssociationsBatchRequest.builder()
                .addInput(
                    PublicFetchAssociationsBatchRequest.builder().id("id").after("after").build()
                )
                .build()

        assertThat(batchInputPublicFetchAssociationsBatchRequest.inputs())
            .containsExactly(
                PublicFetchAssociationsBatchRequest.builder().id("id").after("after").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputPublicFetchAssociationsBatchRequest =
            BatchInputPublicFetchAssociationsBatchRequest.builder()
                .addInput(
                    PublicFetchAssociationsBatchRequest.builder().id("id").after("after").build()
                )
                .build()

        val roundtrippedBatchInputPublicFetchAssociationsBatchRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputPublicFetchAssociationsBatchRequest),
                jacksonTypeRef<BatchInputPublicFetchAssociationsBatchRequest>(),
            )

        assertThat(roundtrippedBatchInputPublicFetchAssociationsBatchRequest)
            .isEqualTo(batchInputPublicFetchAssociationsBatchRequest)
    }
}
