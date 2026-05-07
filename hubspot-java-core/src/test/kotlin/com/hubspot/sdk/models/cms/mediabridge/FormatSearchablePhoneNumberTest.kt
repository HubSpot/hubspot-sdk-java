// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FormatSearchablePhoneNumberTest {

    @Test
    fun create() {
        val formatSearchablePhoneNumber =
            FormatSearchablePhoneNumber.builder()
                .operator(FormatSearchablePhoneNumber.Operator.FORMAT_SEARCHABLE_PHONE_NUMBER)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value("value")
                .build()

        assertThat(formatSearchablePhoneNumber.operator())
            .isEqualTo(FormatSearchablePhoneNumber.Operator.FORMAT_SEARCHABLE_PHONE_NUMBER)
        assertThat(formatSearchablePhoneNumber.inputs().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(formatSearchablePhoneNumber.propertyName()).contains("propertyName")
        assertThat(formatSearchablePhoneNumber.value()).contains("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val formatSearchablePhoneNumber =
            FormatSearchablePhoneNumber.builder()
                .operator(FormatSearchablePhoneNumber.Operator.FORMAT_SEARCHABLE_PHONE_NUMBER)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value("value")
                .build()

        val roundtrippedFormatSearchablePhoneNumber =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(formatSearchablePhoneNumber),
                jacksonTypeRef<FormatSearchablePhoneNumber>(),
            )

        assertThat(roundtrippedFormatSearchablePhoneNumber).isEqualTo(formatSearchablePhoneNumber)
    }
}
