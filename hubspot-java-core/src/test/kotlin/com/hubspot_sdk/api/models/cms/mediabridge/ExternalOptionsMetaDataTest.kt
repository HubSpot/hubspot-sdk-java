// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalOptionsMetaDataTest {

    @Test
    fun create() {
        val externalOptionsMetaData =
            ExternalOptionsMetaData.builder()
                .filter(
                    FilteringMetaData.builder()
                        .includeUnconfirmedUsers(true)
                        .addPipelineId("string")
                        .build()
                )
                .relatedObjectTypeId("relatedObjectTypeId")
                .build()

        assertThat(externalOptionsMetaData.filter())
            .contains(
                FilteringMetaData.builder()
                    .includeUnconfirmedUsers(true)
                    .addPipelineId("string")
                    .build()
            )
        assertThat(externalOptionsMetaData.relatedObjectTypeId()).contains("relatedObjectTypeId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalOptionsMetaData =
            ExternalOptionsMetaData.builder()
                .filter(
                    FilteringMetaData.builder()
                        .includeUnconfirmedUsers(true)
                        .addPipelineId("string")
                        .build()
                )
                .relatedObjectTypeId("relatedObjectTypeId")
                .build()

        val roundtrippedExternalOptionsMetaData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalOptionsMetaData),
                jacksonTypeRef<ExternalOptionsMetaData>(),
            )

        assertThat(roundtrippedExternalOptionsMetaData).isEqualTo(externalOptionsMetaData)
    }
}
