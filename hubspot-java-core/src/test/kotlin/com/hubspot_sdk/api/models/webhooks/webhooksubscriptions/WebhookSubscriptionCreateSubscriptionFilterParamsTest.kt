// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks.webhooksubscriptions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookSubscriptionCreateSubscriptionFilterParamsTest {

    @Test
    fun create() {
        WebhookSubscriptionCreateSubscriptionFilterParams.builder()
            .filterCreateRequest(
                FilterCreateRequest.builder()
                    .filter(
                        Filter.builder()
                            .addCondition(
                                Condition.builder()
                                    .filterType(Condition.FilterType.CRM_OBJECT_PROPERTY)
                                    .operator(Condition.Operator.CONTAINS)
                                    .property("property")
                                    .value("value")
                                    .addValue("string")
                                    .build()
                            )
                            .build()
                    )
                    .subscriptionId(0L)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            WebhookSubscriptionCreateSubscriptionFilterParams.builder()
                .filterCreateRequest(
                    FilterCreateRequest.builder()
                        .filter(
                            Filter.builder()
                                .addCondition(
                                    Condition.builder()
                                        .filterType(Condition.FilterType.CRM_OBJECT_PROPERTY)
                                        .operator(Condition.Operator.CONTAINS)
                                        .property("property")
                                        .value("value")
                                        .addValue("string")
                                        .build()
                                )
                                .build()
                        )
                        .subscriptionId(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                FilterCreateRequest.builder()
                    .filter(
                        Filter.builder()
                            .addCondition(
                                Condition.builder()
                                    .filterType(Condition.FilterType.CRM_OBJECT_PROPERTY)
                                    .operator(Condition.Operator.CONTAINS)
                                    .property("property")
                                    .value("value")
                                    .addValue("string")
                                    .build()
                            )
                            .build()
                    )
                    .subscriptionId(0L)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            WebhookSubscriptionCreateSubscriptionFilterParams.builder()
                .filterCreateRequest(
                    FilterCreateRequest.builder()
                        .filter(
                            Filter.builder()
                                .addCondition(
                                    Condition.builder()
                                        .filterType(Condition.FilterType.CRM_OBJECT_PROPERTY)
                                        .operator(Condition.Operator.CONTAINS)
                                        .property("property")
                                        .build()
                                )
                                .build()
                        )
                        .subscriptionId(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                FilterCreateRequest.builder()
                    .filter(
                        Filter.builder()
                            .addCondition(
                                Condition.builder()
                                    .filterType(Condition.FilterType.CRM_OBJECT_PROPERTY)
                                    .operator(Condition.Operator.CONTAINS)
                                    .property("property")
                                    .build()
                            )
                            .build()
                    )
                    .subscriptionId(0L)
                    .build()
            )
    }
}
