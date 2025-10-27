// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.contacts

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.crm.SimplePublicObjectInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactUpdateParamsTest {

    @Test
    fun create() {
        ContactUpdateParams.builder()
            .contactId("contactId")
            .simplePublicObjectInput(
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ContactUpdateParams.builder()
                .contactId("contactId")
                .simplePublicObjectInput(
                    SimplePublicObjectInput.builder()
                        .properties(
                            SimplePublicObjectInput.Properties.builder()
                                .putAdditionalProperty("property_checkbox", JsonValue.from("false"))
                                .putAdditionalProperty(
                                    "property_date",
                                    JsonValue.from("1572480000000"),
                                )
                                .putAdditionalProperty(
                                    "property_dropdown",
                                    JsonValue.from("choice_b"),
                                )
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
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("contactId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ContactUpdateParams.builder()
                .contactId("contactId")
                .simplePublicObjectInput(
                    SimplePublicObjectInput.builder()
                        .properties(
                            SimplePublicObjectInput.Properties.builder()
                                .putAdditionalProperty("property_checkbox", JsonValue.from("false"))
                                .putAdditionalProperty(
                                    "property_date",
                                    JsonValue.from("1572480000000"),
                                )
                                .putAdditionalProperty(
                                    "property_dropdown",
                                    JsonValue.from("choice_b"),
                                )
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }
}
