// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OEmbedDomainsCollectionResponseTest {

    @Test
    fun create() {
        val oEmbedDomainsCollectionResponse =
            OEmbedDomainsCollectionResponse.builder()
                .addResult(
                    IntegratorOEmbedDomainModel.builder()
                        .id(0L)
                        .appId(0)
                        .createdAt(0L)
                        .deletedAt(0L)
                        .endpoints(
                            Endpoints.builder()
                                .discovery(true)
                                .addScheme("string")
                                .url("url")
                                .build()
                        )
                        .portalId(0)
                        .updatedAt(0L)
                        .build()
                )
                .totalCount(0)
                .build()

        assertThat(oEmbedDomainsCollectionResponse.results())
            .containsExactly(
                IntegratorOEmbedDomainModel.builder()
                    .id(0L)
                    .appId(0)
                    .createdAt(0L)
                    .deletedAt(0L)
                    .endpoints(
                        Endpoints.builder().discovery(true).addScheme("string").url("url").build()
                    )
                    .portalId(0)
                    .updatedAt(0L)
                    .build()
            )
        assertThat(oEmbedDomainsCollectionResponse.totalCount()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val oEmbedDomainsCollectionResponse =
            OEmbedDomainsCollectionResponse.builder()
                .addResult(
                    IntegratorOEmbedDomainModel.builder()
                        .id(0L)
                        .appId(0)
                        .createdAt(0L)
                        .deletedAt(0L)
                        .endpoints(
                            Endpoints.builder()
                                .discovery(true)
                                .addScheme("string")
                                .url("url")
                                .build()
                        )
                        .portalId(0)
                        .updatedAt(0L)
                        .build()
                )
                .totalCount(0)
                .build()

        val roundtrippedOEmbedDomainsCollectionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(oEmbedDomainsCollectionResponse),
                jacksonTypeRef<OEmbedDomainsCollectionResponse>(),
            )

        assertThat(roundtrippedOEmbedDomainsCollectionResponse)
            .isEqualTo(oEmbedDomainsCollectionResponse)
    }
}
