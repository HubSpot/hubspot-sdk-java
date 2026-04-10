// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class SubscriptionUpsertRequestTest {

    @Test
    fun ofObjectSubscriptionUpsertRequest() {
        val objectSubscriptionUpsertRequest =
            ObjectSubscriptionUpsertRequest.builder()
                .addAction(ObjectSubscriptionUpsertRequest.Action.CREATE)
                .addObjectId(0L)
                .objectTypeId("objectTypeId")
                .portalId(0L)
                .addProperty("string")
                .subscriptionType(ObjectSubscriptionUpsertRequest.SubscriptionType.OBJECT)
                .build()

        val subscriptionUpsertRequest =
            SubscriptionUpsertRequest.ofObjectSubscriptionUpsertRequest(
                objectSubscriptionUpsertRequest
            )

        assertThat(subscriptionUpsertRequest.objectSubscriptionUpsertRequest())
            .contains(objectSubscriptionUpsertRequest)
        assertThat(subscriptionUpsertRequest.association()).isEmpty
        assertThat(subscriptionUpsertRequest.appLifecycleEvent()).isEmpty
        assertThat(subscriptionUpsertRequest.listMembership()).isEmpty
    }

    @Test
    fun ofObjectSubscriptionUpsertRequestRoundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionUpsertRequest =
            SubscriptionUpsertRequest.ofObjectSubscriptionUpsertRequest(
                ObjectSubscriptionUpsertRequest.builder()
                    .addAction(ObjectSubscriptionUpsertRequest.Action.CREATE)
                    .addObjectId(0L)
                    .objectTypeId("objectTypeId")
                    .portalId(0L)
                    .addProperty("string")
                    .subscriptionType(ObjectSubscriptionUpsertRequest.SubscriptionType.OBJECT)
                    .build()
            )

        val roundtrippedSubscriptionUpsertRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionUpsertRequest),
                jacksonTypeRef<SubscriptionUpsertRequest>(),
            )

        assertThat(roundtrippedSubscriptionUpsertRequest).isEqualTo(subscriptionUpsertRequest)
    }

    @Test
    fun ofAssociation() {
        val association =
            AssociationSubscriptionUpsertRequest.builder()
                .addAction(AssociationSubscriptionUpsertRequest.Action.CREATE)
                .addAssociatedObjectTypeId("string")
                .addObjectId(0L)
                .objectTypeId("objectTypeId")
                .portalId(0L)
                .subscriptionType(AssociationSubscriptionUpsertRequest.SubscriptionType.OBJECT)
                .build()

        val subscriptionUpsertRequest = SubscriptionUpsertRequest.ofAssociation(association)

        assertThat(subscriptionUpsertRequest.objectSubscriptionUpsertRequest()).isEmpty
        assertThat(subscriptionUpsertRequest.association()).contains(association)
        assertThat(subscriptionUpsertRequest.appLifecycleEvent()).isEmpty
        assertThat(subscriptionUpsertRequest.listMembership()).isEmpty
    }

    @Test
    fun ofAssociationRoundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionUpsertRequest =
            SubscriptionUpsertRequest.ofAssociation(
                AssociationSubscriptionUpsertRequest.builder()
                    .addAction(AssociationSubscriptionUpsertRequest.Action.CREATE)
                    .addAssociatedObjectTypeId("string")
                    .addObjectId(0L)
                    .objectTypeId("objectTypeId")
                    .portalId(0L)
                    .subscriptionType(AssociationSubscriptionUpsertRequest.SubscriptionType.OBJECT)
                    .build()
            )

        val roundtrippedSubscriptionUpsertRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionUpsertRequest),
                jacksonTypeRef<SubscriptionUpsertRequest>(),
            )

        assertThat(roundtrippedSubscriptionUpsertRequest).isEqualTo(subscriptionUpsertRequest)
    }

    @Test
    fun ofAppLifecycleEvent() {
        val appLifecycleEvent =
            AppLifecycleEventSubscriptionUpsertRequest.builder()
                .eventTypeId("eventTypeId")
                .addProperty("string")
                .subscriptionType(
                    AppLifecycleEventSubscriptionUpsertRequest.SubscriptionType.OBJECT
                )
                .build()

        val subscriptionUpsertRequest =
            SubscriptionUpsertRequest.ofAppLifecycleEvent(appLifecycleEvent)

        assertThat(subscriptionUpsertRequest.objectSubscriptionUpsertRequest()).isEmpty
        assertThat(subscriptionUpsertRequest.association()).isEmpty
        assertThat(subscriptionUpsertRequest.appLifecycleEvent()).contains(appLifecycleEvent)
        assertThat(subscriptionUpsertRequest.listMembership()).isEmpty
    }

    @Test
    fun ofAppLifecycleEventRoundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionUpsertRequest =
            SubscriptionUpsertRequest.ofAppLifecycleEvent(
                AppLifecycleEventSubscriptionUpsertRequest.builder()
                    .eventTypeId("eventTypeId")
                    .addProperty("string")
                    .subscriptionType(
                        AppLifecycleEventSubscriptionUpsertRequest.SubscriptionType.OBJECT
                    )
                    .build()
            )

        val roundtrippedSubscriptionUpsertRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionUpsertRequest),
                jacksonTypeRef<SubscriptionUpsertRequest>(),
            )

        assertThat(roundtrippedSubscriptionUpsertRequest).isEqualTo(subscriptionUpsertRequest)
    }

    @Test
    fun ofListMembership() {
        val listMembership =
            ListMembershipSubscriptionUpsertRequest.builder()
                .addAction(ListMembershipSubscriptionUpsertRequest.Action.CREATE)
                .addListId(0L)
                .addObjectId(0L)
                .portalId(0L)
                .subscriptionType(ListMembershipSubscriptionUpsertRequest.SubscriptionType.OBJECT)
                .build()

        val subscriptionUpsertRequest = SubscriptionUpsertRequest.ofListMembership(listMembership)

        assertThat(subscriptionUpsertRequest.objectSubscriptionUpsertRequest()).isEmpty
        assertThat(subscriptionUpsertRequest.association()).isEmpty
        assertThat(subscriptionUpsertRequest.appLifecycleEvent()).isEmpty
        assertThat(subscriptionUpsertRequest.listMembership()).contains(listMembership)
    }

    @Test
    fun ofListMembershipRoundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionUpsertRequest =
            SubscriptionUpsertRequest.ofListMembership(
                ListMembershipSubscriptionUpsertRequest.builder()
                    .addAction(ListMembershipSubscriptionUpsertRequest.Action.CREATE)
                    .addListId(0L)
                    .addObjectId(0L)
                    .portalId(0L)
                    .subscriptionType(
                        ListMembershipSubscriptionUpsertRequest.SubscriptionType.OBJECT
                    )
                    .build()
            )

        val roundtrippedSubscriptionUpsertRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionUpsertRequest),
                jacksonTypeRef<SubscriptionUpsertRequest>(),
            )

        assertThat(roundtrippedSubscriptionUpsertRequest).isEqualTo(subscriptionUpsertRequest)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val subscriptionUpsertRequest =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<SubscriptionUpsertRequest>())

        val e = assertThrows<HubSpotInvalidDataException> { subscriptionUpsertRequest.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
