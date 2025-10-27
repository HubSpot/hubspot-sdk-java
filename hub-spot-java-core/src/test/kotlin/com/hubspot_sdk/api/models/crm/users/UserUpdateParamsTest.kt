// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.users

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.crm.SimplePublicObjectInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserUpdateParamsTest {

    @Test
    fun create() {
        UserUpdateParams.builder()
            .userId("userId")
            .idProperty("idProperty")
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
            UserUpdateParams.builder()
                .userId("userId")
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

        assertThat(params._pathParam(0)).isEqualTo("userId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            UserUpdateParams.builder()
                .userId("userId")
                .idProperty("idProperty")
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("idProperty", "idProperty").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            UserUpdateParams.builder()
                .userId("userId")
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

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            UserUpdateParams.builder()
                .userId("userId")
                .idProperty("idProperty")
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

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UserUpdateParams.builder()
                .userId("userId")
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
