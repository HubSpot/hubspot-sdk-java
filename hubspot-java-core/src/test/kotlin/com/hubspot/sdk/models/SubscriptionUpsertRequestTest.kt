// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class SubscriptionUpsertRequestTest {

    @Test
    fun ofObject() {
        val object_ =
            ObjectSubscriptionUpsertRequest.builder()
                .addAction(ObjectSubscriptionUpsertRequest.Action.CREATE)
                .addObjectId(0L)
                .objectTypeId("objectTypeId")
                .portalId(0L)
                .addProperty("string")
                .subscriptionType(ObjectSubscriptionUpsertRequest.SubscriptionType.OBJECT)
                .build()

        val subscriptionUpsertRequest = SubscriptionUpsertRequest.ofObject(object_)

        assertThat(subscriptionUpsertRequest.object_()).contains(object_)
        assertThat(subscriptionUpsertRequest.association()).isEmpty
        assertThat(subscriptionUpsertRequest.appLifecycleEvent()).isEmpty
        assertThat(subscriptionUpsertRequest.listMembership()).isEmpty
        assertThat(subscriptionUpsertRequest.gdprPrivacyDeletion()).isEmpty
    }

    @Test
    fun ofObjectRoundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionUpsertRequest =
            SubscriptionUpsertRequest.ofObject(
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
                .subscriptionType(AssociationSubscriptionUpsertRequest.SubscriptionType.ASSOCIATION)
                .build()

        val subscriptionUpsertRequest = SubscriptionUpsertRequest.ofAssociation(association)

        assertThat(subscriptionUpsertRequest.object_()).isEmpty
        assertThat(subscriptionUpsertRequest.association()).contains(association)
        assertThat(subscriptionUpsertRequest.appLifecycleEvent()).isEmpty
        assertThat(subscriptionUpsertRequest.listMembership()).isEmpty
        assertThat(subscriptionUpsertRequest.gdprPrivacyDeletion()).isEmpty
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
                    .subscriptionType(
                        AssociationSubscriptionUpsertRequest.SubscriptionType.ASSOCIATION
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
    fun ofAppLifecycleEvent() {
        val appLifecycleEvent =
            AppLifecycleEventSubscriptionUpsertRequest.builder()
                .eventTypeId("eventTypeId")
                .addProperty("string")
                .subscriptionType(
                    AppLifecycleEventSubscriptionUpsertRequest.SubscriptionType.APP_LIFECYCLE_EVENT
                )
                .build()

        val subscriptionUpsertRequest =
            SubscriptionUpsertRequest.ofAppLifecycleEvent(appLifecycleEvent)

        assertThat(subscriptionUpsertRequest.object_()).isEmpty
        assertThat(subscriptionUpsertRequest.association()).isEmpty
        assertThat(subscriptionUpsertRequest.appLifecycleEvent()).contains(appLifecycleEvent)
        assertThat(subscriptionUpsertRequest.listMembership()).isEmpty
        assertThat(subscriptionUpsertRequest.gdprPrivacyDeletion()).isEmpty
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
                        AppLifecycleEventSubscriptionUpsertRequest.SubscriptionType
                            .APP_LIFECYCLE_EVENT
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
                .subscriptionType(
                    ListMembershipSubscriptionUpsertRequest.SubscriptionType.LIST_MEMBERSHIP
                )
                .build()

        val subscriptionUpsertRequest = SubscriptionUpsertRequest.ofListMembership(listMembership)

        assertThat(subscriptionUpsertRequest.object_()).isEmpty
        assertThat(subscriptionUpsertRequest.association()).isEmpty
        assertThat(subscriptionUpsertRequest.appLifecycleEvent()).isEmpty
        assertThat(subscriptionUpsertRequest.listMembership()).contains(listMembership)
        assertThat(subscriptionUpsertRequest.gdprPrivacyDeletion()).isEmpty
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
                        ListMembershipSubscriptionUpsertRequest.SubscriptionType.LIST_MEMBERSHIP
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
    fun ofGdprPrivacyDeletion() {
        val gdprPrivacyDeletion =
            GdprPrivacyDeletionSubscriptionUpsertRequest.builder()
                .addAction(GdprPrivacyDeletionSubscriptionUpsertRequest.Action.CREATE)
                .objectTypeId("objectTypeId")
                .portalId(0L)
                .subscriptionType(
                    GdprPrivacyDeletionSubscriptionUpsertRequest.SubscriptionType
                        .GDPR_PRIVACY_DELETION
                )
                .build()

        val subscriptionUpsertRequest =
            SubscriptionUpsertRequest.ofGdprPrivacyDeletion(gdprPrivacyDeletion)

        assertThat(subscriptionUpsertRequest.object_()).isEmpty
        assertThat(subscriptionUpsertRequest.association()).isEmpty
        assertThat(subscriptionUpsertRequest.appLifecycleEvent()).isEmpty
        assertThat(subscriptionUpsertRequest.listMembership()).isEmpty
        assertThat(subscriptionUpsertRequest.gdprPrivacyDeletion()).contains(gdprPrivacyDeletion)
    }

    @Test
    fun ofGdprPrivacyDeletionRoundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionUpsertRequest =
            SubscriptionUpsertRequest.ofGdprPrivacyDeletion(
                GdprPrivacyDeletionSubscriptionUpsertRequest.builder()
                    .addAction(GdprPrivacyDeletionSubscriptionUpsertRequest.Action.CREATE)
                    .objectTypeId("objectTypeId")
                    .portalId(0L)
                    .subscriptionType(
                        GdprPrivacyDeletionSubscriptionUpsertRequest.SubscriptionType
                            .GDPR_PRIVACY_DELETION
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
