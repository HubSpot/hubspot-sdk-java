// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.cardsdev

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TopLevelActionsTest {

    @Test
    fun create() {
        val topLevelActions =
            TopLevelActions.builder()
                .addSecondary(
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
                .primary(
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
                .settings(
                    IFrameActionBody.builder()
                        .height(0)
                        .addPropertyNamesIncluded("string")
                        .type(IFrameActionBody.Type.IFRAME)
                        .url("url")
                        .width(0)
                        .label("label")
                        .build()
                )
                .build()

        assertThat(topLevelActions.secondary())
            .containsExactly(
                TopLevelActions.Secondary.ofActionHookActionBody(
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
        assertThat(topLevelActions.primary())
            .contains(
                TopLevelActions.Primary.ofActionHookActionBody(
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
        assertThat(topLevelActions.settings())
            .contains(
                IFrameActionBody.builder()
                    .height(0)
                    .addPropertyNamesIncluded("string")
                    .type(IFrameActionBody.Type.IFRAME)
                    .url("url")
                    .width(0)
                    .label("label")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val topLevelActions =
            TopLevelActions.builder()
                .addSecondary(
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
                .primary(
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
                .settings(
                    IFrameActionBody.builder()
                        .height(0)
                        .addPropertyNamesIncluded("string")
                        .type(IFrameActionBody.Type.IFRAME)
                        .url("url")
                        .width(0)
                        .label("label")
                        .build()
                )
                .build()

        val roundtrippedTopLevelActions =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(topLevelActions),
                jacksonTypeRef<TopLevelActions>(),
            )

        assertThat(roundtrippedTopLevelActions).isEqualTo(topLevelActions)
    }
}
