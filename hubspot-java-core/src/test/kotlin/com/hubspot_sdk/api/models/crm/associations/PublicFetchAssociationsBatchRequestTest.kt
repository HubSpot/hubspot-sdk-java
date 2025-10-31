// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicFetchAssociationsBatchRequestTest {

    @Test
    fun create() {
        val publicFetchAssociationsBatchRequest =
            PublicFetchAssociationsBatchRequest.builder().id("id").after("after").build()

        assertThat(publicFetchAssociationsBatchRequest.id()).isEqualTo("id")
        assertThat(publicFetchAssociationsBatchRequest.after()).contains("after")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicFetchAssociationsBatchRequest =
            PublicFetchAssociationsBatchRequest.builder().id("id").after("after").build()

        val roundtrippedPublicFetchAssociationsBatchRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicFetchAssociationsBatchRequest),
                jacksonTypeRef<PublicFetchAssociationsBatchRequest>(),
            )

        assertThat(roundtrippedPublicFetchAssociationsBatchRequest)
            .isEqualTo(publicFetchAssociationsBatchRequest)
    }
}
