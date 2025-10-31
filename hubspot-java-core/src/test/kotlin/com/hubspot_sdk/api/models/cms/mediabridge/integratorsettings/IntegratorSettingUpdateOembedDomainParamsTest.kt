// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegratorSettingUpdateOembedDomainParamsTest {

    @Test
    fun create() {
        IntegratorSettingUpdateOembedDomainParams.builder()
            .appId("appId")
            .oEmbedDomainId("oEmbedDomainId")
            .endpoints(
                IntegratorSettingUpdateOembedDomainParams.Endpoints.builder()
                    .discovery(true)
                    .addScheme("string")
                    .url("url")
                    .build()
            )
            .portalId(0)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            IntegratorSettingUpdateOembedDomainParams.builder()
                .appId("appId")
                .oEmbedDomainId("oEmbedDomainId")
                .endpoints(
                    IntegratorSettingUpdateOembedDomainParams.Endpoints.builder()
                        .discovery(true)
                        .addScheme("string")
                        .url("url")
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
            IntegratorSettingUpdateOembedDomainParams.builder()
                .appId("appId")
                .oEmbedDomainId("oEmbedDomainId")
                .endpoints(
                    IntegratorSettingUpdateOembedDomainParams.Endpoints.builder()
                        .discovery(true)
                        .addScheme("string")
                        .url("url")
                        .build()
                )
                .portalId(0)
                .build()

        val body = params._body()

        assertThat(body.endpoints())
            .isEqualTo(
                IntegratorSettingUpdateOembedDomainParams.Endpoints.builder()
                    .discovery(true)
                    .addScheme("string")
                    .url("url")
                    .build()
            )
        assertThat(body.portalId()).contains(0)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            IntegratorSettingUpdateOembedDomainParams.builder()
                .appId("appId")
                .oEmbedDomainId("oEmbedDomainId")
                .endpoints(
                    IntegratorSettingUpdateOembedDomainParams.Endpoints.builder()
                        .discovery(true)
                        .addScheme("string")
                        .url("url")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.endpoints())
            .isEqualTo(
                IntegratorSettingUpdateOembedDomainParams.Endpoints.builder()
                    .discovery(true)
                    .addScheme("string")
                    .url("url")
                    .build()
            )
    }
}
