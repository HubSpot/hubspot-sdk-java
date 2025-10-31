// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiContactPropertyAnchorTest {

    @Test
    fun create() {
        val apiContactPropertyAnchor =
            ApiContactPropertyAnchor.builder()
                .contactProperty("contactProperty")
                .type(ApiContactPropertyAnchor.Type.CONTACT_PROPERTY_ANCHOR)
                .build()

        assertThat(apiContactPropertyAnchor.contactProperty()).isEqualTo("contactProperty")
        assertThat(apiContactPropertyAnchor.type())
            .isEqualTo(ApiContactPropertyAnchor.Type.CONTACT_PROPERTY_ANCHOR)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiContactPropertyAnchor =
            ApiContactPropertyAnchor.builder()
                .contactProperty("contactProperty")
                .type(ApiContactPropertyAnchor.Type.CONTACT_PROPERTY_ANCHOR)
                .build()

        val roundtrippedApiContactPropertyAnchor =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiContactPropertyAnchor),
                jacksonTypeRef<ApiContactPropertyAnchor>(),
            )

        assertThat(roundtrippedApiContactPropertyAnchor).isEqualTo(apiContactPropertyAnchor)
    }
}
