// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.cardsdev

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IFrameActionBodyTest {

    @Test
    fun create() {
        val iFrameActionBody =
            IFrameActionBody.builder()
                .height(0)
                .addPropertyNamesIncluded("string")
                .type(IFrameActionBody.Type.IFRAME)
                .url("url")
                .width(0)
                .label("label")
                .build()

        assertThat(iFrameActionBody.height()).isEqualTo(0)
        assertThat(iFrameActionBody.propertyNamesIncluded()).containsExactly("string")
        assertThat(iFrameActionBody.type()).isEqualTo(IFrameActionBody.Type.IFRAME)
        assertThat(iFrameActionBody.url()).isEqualTo("url")
        assertThat(iFrameActionBody.width()).isEqualTo(0)
        assertThat(iFrameActionBody.label()).contains("label")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val iFrameActionBody =
            IFrameActionBody.builder()
                .height(0)
                .addPropertyNamesIncluded("string")
                .type(IFrameActionBody.Type.IFRAME)
                .url("url")
                .width(0)
                .label("label")
                .build()

        val roundtrippedIFrameActionBody =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(iFrameActionBody),
                jacksonTypeRef<IFrameActionBody>(),
            )

        assertThat(roundtrippedIFrameActionBody).isEqualTo(iFrameActionBody)
    }
}
