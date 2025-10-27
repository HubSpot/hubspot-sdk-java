// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.cards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectTokenTest {

    @Test
    fun create() {
        val objectToken =
            ObjectToken.builder()
                .value("value")
                .dataType(ObjectToken.DataType.BOOLEAN)
                .label("label")
                .name("name")
                .build()

        assertThat(objectToken.value()).isEqualTo("value")
        assertThat(objectToken.dataType()).contains(ObjectToken.DataType.BOOLEAN)
        assertThat(objectToken.label()).contains("label")
        assertThat(objectToken.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectToken =
            ObjectToken.builder()
                .value("value")
                .dataType(ObjectToken.DataType.BOOLEAN)
                .label("label")
                .name("name")
                .build()

        val roundtrippedObjectToken =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectToken),
                jacksonTypeRef<ObjectToken>(),
            )

        assertThat(roundtrippedObjectToken).isEqualTo(objectToken)
    }
}
