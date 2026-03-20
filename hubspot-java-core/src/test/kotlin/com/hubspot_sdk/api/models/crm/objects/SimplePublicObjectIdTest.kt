// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimplePublicObjectIdTest {

    @Test
    fun create() {
        val simplePublicObjectId = SimplePublicObjectId.builder().id("430001").build()

        assertThat(simplePublicObjectId.id()).isEqualTo("430001")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simplePublicObjectId = SimplePublicObjectId.builder().id("430001").build()

        val roundtrippedSimplePublicObjectId =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simplePublicObjectId),
                jacksonTypeRef<SimplePublicObjectId>(),
            )

        assertThat(roundtrippedSimplePublicObjectId).isEqualTo(simplePublicObjectId)
    }
}
