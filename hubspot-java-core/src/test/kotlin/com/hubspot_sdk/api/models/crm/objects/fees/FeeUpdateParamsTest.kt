// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.fees

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeeUpdateParamsTest {

    @Test
    fun create() {
        FeeUpdateParams.builder()
            .feeId("feeId")
            .idProperty("idProperty")
            .simplePublicObjectInput(
                SimplePublicObjectInput.builder()
                    .properties(
                        SimplePublicObjectInput.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FeeUpdateParams.builder()
                .feeId("feeId")
                .simplePublicObjectInput(
                    SimplePublicObjectInput.builder()
                        .properties(
                            SimplePublicObjectInput.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("feeId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            FeeUpdateParams.builder()
                .feeId("feeId")
                .idProperty("idProperty")
                .simplePublicObjectInput(
                    SimplePublicObjectInput.builder()
                        .properties(
                            SimplePublicObjectInput.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
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
            FeeUpdateParams.builder()
                .feeId("feeId")
                .simplePublicObjectInput(
                    SimplePublicObjectInput.builder()
                        .properties(
                            SimplePublicObjectInput.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
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
            FeeUpdateParams.builder()
                .feeId("feeId")
                .idProperty("idProperty")
                .simplePublicObjectInput(
                    SimplePublicObjectInput.builder()
                        .properties(
                            SimplePublicObjectInput.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
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
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FeeUpdateParams.builder()
                .feeId("feeId")
                .simplePublicObjectInput(
                    SimplePublicObjectInput.builder()
                        .properties(
                            SimplePublicObjectInput.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
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
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
    }
}
