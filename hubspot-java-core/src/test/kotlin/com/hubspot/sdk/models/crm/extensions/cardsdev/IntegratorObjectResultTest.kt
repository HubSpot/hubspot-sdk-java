// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.extensions.cardsdev

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegratorObjectResultTest {

    @Test
    fun create() {
        val integratorObjectResult =
            IntegratorObjectResult.builder()
                .id("id")
                .addAction(
                    ActionHookActionBody.builder()
                        .httpMethod(ActionHookActionBody.HttpMethod.CONNECT)
                        .addPropertyNamesIncluded("string")
                        .type(ActionHookActionBody.Type.ACTION_HOOK)
                        .url("url")
                        .confirmation(
                            ActionConfirmationBody.builder()
                                .cancelButtonLabel("cancelButtonLabel")
                                .confirmButtonLabel("confirmButtonLabel")
                                .prompt("prompt")
                                .build()
                        )
                        .label("label")
                        .build()
                )
                .title("title")
                .addToken(
                    ObjectToken.builder()
                        .value("value")
                        .dataType(ObjectToken.DataType.BOOLEAN)
                        .label("label")
                        .name("name")
                        .build()
                )
                .linkUrl("linkUrl")
                .build()

        assertThat(integratorObjectResult.id()).isEqualTo("id")
        assertThat(integratorObjectResult.actions())
            .containsExactly(
                IntegratorObjectResult.Action.ofHookActionBody(
                    ActionHookActionBody.builder()
                        .httpMethod(ActionHookActionBody.HttpMethod.CONNECT)
                        .addPropertyNamesIncluded("string")
                        .type(ActionHookActionBody.Type.ACTION_HOOK)
                        .url("url")
                        .confirmation(
                            ActionConfirmationBody.builder()
                                .cancelButtonLabel("cancelButtonLabel")
                                .confirmButtonLabel("confirmButtonLabel")
                                .prompt("prompt")
                                .build()
                        )
                        .label("label")
                        .build()
                )
            )
        assertThat(integratorObjectResult.title()).isEqualTo("title")
        assertThat(integratorObjectResult.tokens())
            .containsExactly(
                ObjectToken.builder()
                    .value("value")
                    .dataType(ObjectToken.DataType.BOOLEAN)
                    .label("label")
                    .name("name")
                    .build()
            )
        assertThat(integratorObjectResult.linkUrl()).contains("linkUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integratorObjectResult =
            IntegratorObjectResult.builder()
                .id("id")
                .addAction(
                    ActionHookActionBody.builder()
                        .httpMethod(ActionHookActionBody.HttpMethod.CONNECT)
                        .addPropertyNamesIncluded("string")
                        .type(ActionHookActionBody.Type.ACTION_HOOK)
                        .url("url")
                        .confirmation(
                            ActionConfirmationBody.builder()
                                .cancelButtonLabel("cancelButtonLabel")
                                .confirmButtonLabel("confirmButtonLabel")
                                .prompt("prompt")
                                .build()
                        )
                        .label("label")
                        .build()
                )
                .title("title")
                .addToken(
                    ObjectToken.builder()
                        .value("value")
                        .dataType(ObjectToken.DataType.BOOLEAN)
                        .label("label")
                        .name("name")
                        .build()
                )
                .linkUrl("linkUrl")
                .build()

        val roundtrippedIntegratorObjectResult =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integratorObjectResult),
                jacksonTypeRef<IntegratorObjectResult>(),
            )

        assertThat(roundtrippedIntegratorObjectResult).isEqualTo(integratorObjectResult)
    }
}
