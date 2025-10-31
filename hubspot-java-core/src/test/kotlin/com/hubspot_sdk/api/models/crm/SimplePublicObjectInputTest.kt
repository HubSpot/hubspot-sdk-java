// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimplePublicObjectInputTest {

    @Test
    fun create() {
        val simplePublicObjectInput =
            SimplePublicObjectInput.builder()
                .properties(
                    SimplePublicObjectInput.Properties.builder()
                        .putAdditionalProperty("property_checkbox", JsonValue.from("false"))
                        .putAdditionalProperty("property_date", JsonValue.from("1572480000000"))
                        .putAdditionalProperty("property_dropdown", JsonValue.from("choice_b"))
                        .putAdditionalProperty(
                            "property_multiple_checkboxes",
                            JsonValue.from("chocolate;strawberry"),
                        )
                        .putAdditionalProperty("property_number", JsonValue.from("17"))
                        .putAdditionalProperty("property_radio", JsonValue.from("option_1"))
                        .putAdditionalProperty("property_string", JsonValue.from("value"))
                        .build()
                )
                .build()

        assertThat(simplePublicObjectInput.properties())
            .isEqualTo(
                SimplePublicObjectInput.Properties.builder()
                    .putAdditionalProperty("property_checkbox", JsonValue.from("false"))
                    .putAdditionalProperty("property_date", JsonValue.from("1572480000000"))
                    .putAdditionalProperty("property_dropdown", JsonValue.from("choice_b"))
                    .putAdditionalProperty(
                        "property_multiple_checkboxes",
                        JsonValue.from("chocolate;strawberry"),
                    )
                    .putAdditionalProperty("property_number", JsonValue.from("17"))
                    .putAdditionalProperty("property_radio", JsonValue.from("option_1"))
                    .putAdditionalProperty("property_string", JsonValue.from("value"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simplePublicObjectInput =
            SimplePublicObjectInput.builder()
                .properties(
                    SimplePublicObjectInput.Properties.builder()
                        .putAdditionalProperty("property_checkbox", JsonValue.from("false"))
                        .putAdditionalProperty("property_date", JsonValue.from("1572480000000"))
                        .putAdditionalProperty("property_dropdown", JsonValue.from("choice_b"))
                        .putAdditionalProperty(
                            "property_multiple_checkboxes",
                            JsonValue.from("chocolate;strawberry"),
                        )
                        .putAdditionalProperty("property_number", JsonValue.from("17"))
                        .putAdditionalProperty("property_radio", JsonValue.from("option_1"))
                        .putAdditionalProperty("property_string", JsonValue.from("value"))
                        .build()
                )
                .build()

        val roundtrippedSimplePublicObjectInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simplePublicObjectInput),
                jacksonTypeRef<SimplePublicObjectInput>(),
            )

        assertThat(roundtrippedSimplePublicObjectInput).isEqualTo(simplePublicObjectInput)
    }
}
