// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.propertiesvalidations.CollectionResponsePublicPropertyValidationRuleMapNoPaging
import com.hubspot_sdk.api.models.crm.propertiesvalidations.CollectionResponsePublicPropertyValidationRuleNoPaging
import com.hubspot_sdk.api.models.crm.propertiesvalidations.PropertiesValidationGetByObjectTypeIdAndPropertyNameParams
import com.hubspot_sdk.api.models.crm.propertiesvalidations.PropertiesValidationGetByObjectTypeIdParams
import com.hubspot_sdk.api.models.crm.propertiesvalidations.PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams
import com.hubspot_sdk.api.models.crm.propertiesvalidations.PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams
import com.hubspot_sdk.api.models.crm.propertiesvalidations.PublicPropertyValidationRule
import java.util.function.Consumer

interface PropertiesValidationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PropertiesValidationService

    /** Read all properties with validation rules for a given object. */
    fun getByObjectTypeId(
        objectTypeId: String
    ): CollectionResponsePublicPropertyValidationRuleMapNoPaging =
        getByObjectTypeId(objectTypeId, PropertiesValidationGetByObjectTypeIdParams.none())

    /** @see getByObjectTypeId */
    fun getByObjectTypeId(
        objectTypeId: String,
        params: PropertiesValidationGetByObjectTypeIdParams =
            PropertiesValidationGetByObjectTypeIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicPropertyValidationRuleMapNoPaging =
        getByObjectTypeId(params.toBuilder().objectTypeId(objectTypeId).build(), requestOptions)

    /** @see getByObjectTypeId */
    fun getByObjectTypeId(
        objectTypeId: String,
        params: PropertiesValidationGetByObjectTypeIdParams =
            PropertiesValidationGetByObjectTypeIdParams.none(),
    ): CollectionResponsePublicPropertyValidationRuleMapNoPaging =
        getByObjectTypeId(objectTypeId, params, RequestOptions.none())

    /** @see getByObjectTypeId */
    fun getByObjectTypeId(
        params: PropertiesValidationGetByObjectTypeIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicPropertyValidationRuleMapNoPaging

    /** @see getByObjectTypeId */
    fun getByObjectTypeId(
        params: PropertiesValidationGetByObjectTypeIdParams
    ): CollectionResponsePublicPropertyValidationRuleMapNoPaging =
        getByObjectTypeId(params, RequestOptions.none())

    /** @see getByObjectTypeId */
    fun getByObjectTypeId(
        objectTypeId: String,
        requestOptions: RequestOptions,
    ): CollectionResponsePublicPropertyValidationRuleMapNoPaging =
        getByObjectTypeId(
            objectTypeId,
            PropertiesValidationGetByObjectTypeIdParams.none(),
            requestOptions,
        )

    /** Read a property's validation rules identified by {propertyName}. */
    fun getByObjectTypeIdAndPropertyName(
        propertyName: String,
        params: PropertiesValidationGetByObjectTypeIdAndPropertyNameParams,
    ): CollectionResponsePublicPropertyValidationRuleNoPaging =
        getByObjectTypeIdAndPropertyName(propertyName, params, RequestOptions.none())

    /** @see getByObjectTypeIdAndPropertyName */
    fun getByObjectTypeIdAndPropertyName(
        propertyName: String,
        params: PropertiesValidationGetByObjectTypeIdAndPropertyNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicPropertyValidationRuleNoPaging =
        getByObjectTypeIdAndPropertyName(
            params.toBuilder().propertyName(propertyName).build(),
            requestOptions,
        )

    /** @see getByObjectTypeIdAndPropertyName */
    fun getByObjectTypeIdAndPropertyName(
        params: PropertiesValidationGetByObjectTypeIdAndPropertyNameParams
    ): CollectionResponsePublicPropertyValidationRuleNoPaging =
        getByObjectTypeIdAndPropertyName(params, RequestOptions.none())

    /** @see getByObjectTypeIdAndPropertyName */
    fun getByObjectTypeIdAndPropertyName(
        params: PropertiesValidationGetByObjectTypeIdAndPropertyNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicPropertyValidationRuleNoPaging

    /** Retrieve a specific validation rule for a property identified by its name and rule type. */
    fun getByObjectTypeIdPropertyNameAndRuleType(
        ruleType: PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams.RuleType,
        params: PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams,
    ): PublicPropertyValidationRule =
        getByObjectTypeIdPropertyNameAndRuleType(ruleType, params, RequestOptions.none())

    /** @see getByObjectTypeIdPropertyNameAndRuleType */
    fun getByObjectTypeIdPropertyNameAndRuleType(
        ruleType: PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams.RuleType,
        params: PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicPropertyValidationRule =
        getByObjectTypeIdPropertyNameAndRuleType(
            params.toBuilder().ruleType(ruleType).build(),
            requestOptions,
        )

    /** @see getByObjectTypeIdPropertyNameAndRuleType */
    fun getByObjectTypeIdPropertyNameAndRuleType(
        params: PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams
    ): PublicPropertyValidationRule =
        getByObjectTypeIdPropertyNameAndRuleType(params, RequestOptions.none())

    /** @see getByObjectTypeIdPropertyNameAndRuleType */
    fun getByObjectTypeIdPropertyNameAndRuleType(
        params: PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicPropertyValidationRule

    /** Update a specific validation rule for a property identified by its name and rule type. */
    fun updateByObjectTypeIdPropertyNameAndRuleType(
        ruleType: PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams.RuleType,
        params: PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams,
    ) = updateByObjectTypeIdPropertyNameAndRuleType(ruleType, params, RequestOptions.none())

    /** @see updateByObjectTypeIdPropertyNameAndRuleType */
    fun updateByObjectTypeIdPropertyNameAndRuleType(
        ruleType: PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams.RuleType,
        params: PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        updateByObjectTypeIdPropertyNameAndRuleType(
            params.toBuilder().ruleType(ruleType).build(),
            requestOptions,
        )

    /** @see updateByObjectTypeIdPropertyNameAndRuleType */
    fun updateByObjectTypeIdPropertyNameAndRuleType(
        params: PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams
    ) = updateByObjectTypeIdPropertyNameAndRuleType(params, RequestOptions.none())

    /** @see updateByObjectTypeIdPropertyNameAndRuleType */
    fun updateByObjectTypeIdPropertyNameAndRuleType(
        params: PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [PropertiesValidationService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PropertiesValidationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /crm/property-validations/2026-03/{objectTypeId}`,
         * but is otherwise the same as [PropertiesValidationService.getByObjectTypeId].
         */
        @MustBeClosed
        fun getByObjectTypeId(
            objectTypeId: String
        ): HttpResponseFor<CollectionResponsePublicPropertyValidationRuleMapNoPaging> =
            getByObjectTypeId(objectTypeId, PropertiesValidationGetByObjectTypeIdParams.none())

        /** @see getByObjectTypeId */
        @MustBeClosed
        fun getByObjectTypeId(
            objectTypeId: String,
            params: PropertiesValidationGetByObjectTypeIdParams =
                PropertiesValidationGetByObjectTypeIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicPropertyValidationRuleMapNoPaging> =
            getByObjectTypeId(params.toBuilder().objectTypeId(objectTypeId).build(), requestOptions)

        /** @see getByObjectTypeId */
        @MustBeClosed
        fun getByObjectTypeId(
            objectTypeId: String,
            params: PropertiesValidationGetByObjectTypeIdParams =
                PropertiesValidationGetByObjectTypeIdParams.none(),
        ): HttpResponseFor<CollectionResponsePublicPropertyValidationRuleMapNoPaging> =
            getByObjectTypeId(objectTypeId, params, RequestOptions.none())

        /** @see getByObjectTypeId */
        @MustBeClosed
        fun getByObjectTypeId(
            params: PropertiesValidationGetByObjectTypeIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicPropertyValidationRuleMapNoPaging>

        /** @see getByObjectTypeId */
        @MustBeClosed
        fun getByObjectTypeId(
            params: PropertiesValidationGetByObjectTypeIdParams
        ): HttpResponseFor<CollectionResponsePublicPropertyValidationRuleMapNoPaging> =
            getByObjectTypeId(params, RequestOptions.none())

        /** @see getByObjectTypeId */
        @MustBeClosed
        fun getByObjectTypeId(
            objectTypeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponsePublicPropertyValidationRuleMapNoPaging> =
            getByObjectTypeId(
                objectTypeId,
                PropertiesValidationGetByObjectTypeIdParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /crm/property-validations/2026-03/{objectTypeId}/{propertyName}`, but is otherwise the
         * same as [PropertiesValidationService.getByObjectTypeIdAndPropertyName].
         */
        @MustBeClosed
        fun getByObjectTypeIdAndPropertyName(
            propertyName: String,
            params: PropertiesValidationGetByObjectTypeIdAndPropertyNameParams,
        ): HttpResponseFor<CollectionResponsePublicPropertyValidationRuleNoPaging> =
            getByObjectTypeIdAndPropertyName(propertyName, params, RequestOptions.none())

        /** @see getByObjectTypeIdAndPropertyName */
        @MustBeClosed
        fun getByObjectTypeIdAndPropertyName(
            propertyName: String,
            params: PropertiesValidationGetByObjectTypeIdAndPropertyNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicPropertyValidationRuleNoPaging> =
            getByObjectTypeIdAndPropertyName(
                params.toBuilder().propertyName(propertyName).build(),
                requestOptions,
            )

        /** @see getByObjectTypeIdAndPropertyName */
        @MustBeClosed
        fun getByObjectTypeIdAndPropertyName(
            params: PropertiesValidationGetByObjectTypeIdAndPropertyNameParams
        ): HttpResponseFor<CollectionResponsePublicPropertyValidationRuleNoPaging> =
            getByObjectTypeIdAndPropertyName(params, RequestOptions.none())

        /** @see getByObjectTypeIdAndPropertyName */
        @MustBeClosed
        fun getByObjectTypeIdAndPropertyName(
            params: PropertiesValidationGetByObjectTypeIdAndPropertyNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicPropertyValidationRuleNoPaging>

        /**
         * Returns a raw HTTP response for `get
         * /crm/property-validations/2026-03/{objectTypeId}/{propertyName}/rule-type/{ruleType}`,
         * but is otherwise the same as
         * [PropertiesValidationService.getByObjectTypeIdPropertyNameAndRuleType].
         */
        @MustBeClosed
        fun getByObjectTypeIdPropertyNameAndRuleType(
            ruleType: PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams.RuleType,
            params: PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams,
        ): HttpResponseFor<PublicPropertyValidationRule> =
            getByObjectTypeIdPropertyNameAndRuleType(ruleType, params, RequestOptions.none())

        /** @see getByObjectTypeIdPropertyNameAndRuleType */
        @MustBeClosed
        fun getByObjectTypeIdPropertyNameAndRuleType(
            ruleType: PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams.RuleType,
            params: PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicPropertyValidationRule> =
            getByObjectTypeIdPropertyNameAndRuleType(
                params.toBuilder().ruleType(ruleType).build(),
                requestOptions,
            )

        /** @see getByObjectTypeIdPropertyNameAndRuleType */
        @MustBeClosed
        fun getByObjectTypeIdPropertyNameAndRuleType(
            params: PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams
        ): HttpResponseFor<PublicPropertyValidationRule> =
            getByObjectTypeIdPropertyNameAndRuleType(params, RequestOptions.none())

        /** @see getByObjectTypeIdPropertyNameAndRuleType */
        @MustBeClosed
        fun getByObjectTypeIdPropertyNameAndRuleType(
            params: PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicPropertyValidationRule>

        /**
         * Returns a raw HTTP response for `put
         * /crm/property-validations/2026-03/{objectTypeId}/{propertyName}/rule-type/{ruleType}`,
         * but is otherwise the same as
         * [PropertiesValidationService.updateByObjectTypeIdPropertyNameAndRuleType].
         */
        @MustBeClosed
        fun updateByObjectTypeIdPropertyNameAndRuleType(
            ruleType:
                PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams.RuleType,
            params: PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams,
        ): HttpResponse =
            updateByObjectTypeIdPropertyNameAndRuleType(ruleType, params, RequestOptions.none())

        /** @see updateByObjectTypeIdPropertyNameAndRuleType */
        @MustBeClosed
        fun updateByObjectTypeIdPropertyNameAndRuleType(
            ruleType:
                PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams.RuleType,
            params: PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            updateByObjectTypeIdPropertyNameAndRuleType(
                params.toBuilder().ruleType(ruleType).build(),
                requestOptions,
            )

        /** @see updateByObjectTypeIdPropertyNameAndRuleType */
        @MustBeClosed
        fun updateByObjectTypeIdPropertyNameAndRuleType(
            params: PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams
        ): HttpResponse = updateByObjectTypeIdPropertyNameAndRuleType(params, RequestOptions.none())

        /** @see updateByObjectTypeIdPropertyNameAndRuleType */
        @MustBeClosed
        fun updateByObjectTypeIdPropertyNameAndRuleType(
            params: PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
