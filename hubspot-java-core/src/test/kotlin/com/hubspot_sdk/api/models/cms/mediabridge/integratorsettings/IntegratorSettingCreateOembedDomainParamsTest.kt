// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings

import com.hubspot_sdk.api.models.cms.mediabridge.Endpoints
import com.hubspot_sdk.api.models.cms.mediabridge.IntegratorOEmbedDomainRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegratorSettingCreateOembedDomainParamsTest {

    @Test
    fun create() {
        IntegratorSettingCreateOembedDomainParams.builder()
            .appId("appId")
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
            IntegratorSettingCreateOembedDomainParams.builder()
                .appId("appId")
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
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            IntegratorSettingCreateOembedDomainParams.builder()
                .appId("appId")
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
            IntegratorSettingCreateOembedDomainParams.builder()
                .appId("appId")
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
