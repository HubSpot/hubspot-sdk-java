// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.sitesearch

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SiteSearchGetIndexedDataResponseTest {

    @Test
    fun create() {
        val siteSearchGetIndexedDataResponse =
            SiteSearchGetIndexedDataResponse.builder()
                .id("id")
                .fields(
                    SiteSearchGetIndexedDataResponse.Fields.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "metadataField" to true,
                                    "name" to "name",
                                    "value" to mapOf<String, Any>(),
                                    "values" to listOf(mapOf<String, Any>()),
                                )
                            ),
                        )
                        .build()
                )
                .type(SiteSearchGetIndexedDataResponse.Type.LANDING_PAGE)
                .build()

        assertThat(siteSearchGetIndexedDataResponse.id()).isEqualTo("id")
        assertThat(siteSearchGetIndexedDataResponse.fields())
            .isEqualTo(
                SiteSearchGetIndexedDataResponse.Fields.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "metadataField" to true,
                                "name" to "name",
                                "value" to mapOf<String, Any>(),
                                "values" to listOf(mapOf<String, Any>()),
                            )
                        ),
                    )
                    .build()
            )
        assertThat(siteSearchGetIndexedDataResponse.type())
            .isEqualTo(SiteSearchGetIndexedDataResponse.Type.LANDING_PAGE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val siteSearchGetIndexedDataResponse =
            SiteSearchGetIndexedDataResponse.builder()
                .id("id")
                .fields(
                    SiteSearchGetIndexedDataResponse.Fields.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "metadataField" to true,
                                    "name" to "name",
                                    "value" to mapOf<String, Any>(),
                                    "values" to listOf(mapOf<String, Any>()),
                                )
                            ),
                        )
                        .build()
                )
                .type(SiteSearchGetIndexedDataResponse.Type.LANDING_PAGE)
                .build()

        val roundtrippedSiteSearchGetIndexedDataResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(siteSearchGetIndexedDataResponse),
                jacksonTypeRef<SiteSearchGetIndexedDataResponse>(),
            )

        assertThat(roundtrippedSiteSearchGetIndexedDataResponse)
            .isEqualTo(siteSearchGetIndexedDataResponse)
    }
}
