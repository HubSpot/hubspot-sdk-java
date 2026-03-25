// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBridgeUpdateOembedDomainParamsTest {

    @Test
    fun create() {
        MediaBridgeUpdateOembedDomainParams.builder()
            .appId("appId")
            .oEmbedDomainId("oEmbedDomainId")
            .integratorOEmbedDomainRequest(
                IntegratorOEmbedDomainRequest.builder()
                    .endpoints(
                        Endpoints.builder().discovery(true).addScheme("string").url("url").build()
                    )
                    .portalId(0)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MediaBridgeUpdateOembedDomainParams.builder()
                .appId("appId")
                .oEmbedDomainId("oEmbedDomainId")
                .integratorOEmbedDomainRequest(
                    IntegratorOEmbedDomainRequest.builder()
                        .endpoints(
                            Endpoints.builder()
                                .discovery(true)
                                .addScheme("string")
                                .url("url")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("appId")
        assertThat(params._pathParam(1)).isEqualTo("oEmbedDomainId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MediaBridgeUpdateOembedDomainParams.builder()
                .appId("appId")
                .oEmbedDomainId("oEmbedDomainId")
                .integratorOEmbedDomainRequest(
                    IntegratorOEmbedDomainRequest.builder()
                        .endpoints(
                            Endpoints.builder()
                                .discovery(true)
                                .addScheme("string")
                                .url("url")
                                .build()
                        )
                        .portalId(0)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                IntegratorOEmbedDomainRequest.builder()
                    .endpoints(
                        Endpoints.builder().discovery(true).addScheme("string").url("url").build()
                    )
                    .portalId(0)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MediaBridgeUpdateOembedDomainParams.builder()
                .appId("appId")
                .oEmbedDomainId("oEmbedDomainId")
                .integratorOEmbedDomainRequest(
                    IntegratorOEmbedDomainRequest.builder()
                        .endpoints(
                            Endpoints.builder()
                                .discovery(true)
                                .addScheme("string")
                                .url("url")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                IntegratorOEmbedDomainRequest.builder()
                    .endpoints(
                        Endpoints.builder().discovery(true).addScheme("string").url("url").build()
                    )
                    .build()
            )
    }
}
