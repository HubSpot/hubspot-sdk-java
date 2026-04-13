// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.objects.products

import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.http.QueryParams
import com.hubspot.sdk.models.crm.objects.SimplePublicObjectInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductUpdateParamsTest {

    @Test
    fun create() {
        ProductUpdateParams.builder()
            .productId("productId")
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
            ProductUpdateParams.builder()
                .productId("productId")
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

        assertThat(params._pathParam(0)).isEqualTo("productId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ProductUpdateParams.builder()
                .productId("productId")
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
            ProductUpdateParams.builder()
                .productId("productId")
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
            ProductUpdateParams.builder()
                .productId("productId")
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
            ProductUpdateParams.builder()
                .productId("productId")
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
