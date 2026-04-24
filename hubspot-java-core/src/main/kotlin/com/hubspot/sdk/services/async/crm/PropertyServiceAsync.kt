// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.crm

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.BaseProperty
import com.hubspot.sdk.models.crm.properties.CollectionResponsePropertyNoPaging
import com.hubspot.sdk.models.crm.properties.PropertyCreateParams
import com.hubspot.sdk.models.crm.properties.PropertyDeleteParams
import com.hubspot.sdk.models.crm.properties.PropertyGetParams
import com.hubspot.sdk.models.crm.properties.PropertyListParams
import com.hubspot.sdk.models.crm.properties.PropertyUpdateParams
import com.hubspot.sdk.services.async.crm.properties.BatchServiceAsync
import com.hubspot.sdk.services.async.crm.properties.GroupServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PropertyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PropertyServiceAsync

    fun batch(): BatchServiceAsync

    fun groups(): GroupServiceAsync

    /** Create and return a copy of a new property for the specified object type. */
    fun create(objectType: String, params: PropertyCreateParams): CompletableFuture<BaseProperty> =
        create(objectType, params, RequestOptions.none())

    /** @see create */
    fun create(
        objectType: String,
        params: PropertyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BaseProperty> =
        create(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see create */
    fun create(params: PropertyCreateParams): CompletableFuture<BaseProperty> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PropertyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BaseProperty>

    /**
     * Perform a partial update of a property identified by { propertyName }. Provided fields will
     * be overwritten.
     */
    fun update(
        propertyName: String,
        params: PropertyUpdateParams,
    ): CompletableFuture<BaseProperty> = update(propertyName, params, RequestOptions.none())

    /** @see update */
    fun update(
        propertyName: String,
        params: PropertyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BaseProperty> =
        update(params.toBuilder().propertyName(propertyName).build(), requestOptions)

    /** @see update */
    fun update(params: PropertyUpdateParams): CompletableFuture<BaseProperty> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PropertyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BaseProperty>

    /** Read all existing properties for the specified object type and HubSpot account. */
    fun list(objectType: String): CompletableFuture<CollectionResponsePropertyNoPaging> =
        list(objectType, PropertyListParams.none())

    /** @see list */
    fun list(
        objectType: String,
        params: PropertyListParams = PropertyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePropertyNoPaging> =
        list(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see list */
    fun list(
        objectType: String,
        params: PropertyListParams = PropertyListParams.none(),
    ): CompletableFuture<CollectionResponsePropertyNoPaging> =
        list(objectType, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PropertyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePropertyNoPaging>

    /** @see list */
    fun list(params: PropertyListParams): CompletableFuture<CollectionResponsePropertyNoPaging> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        objectType: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponsePropertyNoPaging> =
        list(objectType, PropertyListParams.none(), requestOptions)

    /** Move a property identified by {propertyName} to the recycling bin. */
    fun delete(propertyName: String, params: PropertyDeleteParams): CompletableFuture<Void?> =
        delete(propertyName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        propertyName: String,
        params: PropertyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().propertyName(propertyName).build(), requestOptions)

    /** @see delete */
    fun delete(params: PropertyDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PropertyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Read a property identified by {propertyName}. */
    fun get(propertyName: String, params: PropertyGetParams): CompletableFuture<BaseProperty> =
        get(propertyName, params, RequestOptions.none())

    /** @see get */
    fun get(
        propertyName: String,
        params: PropertyGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BaseProperty> =
        get(params.toBuilder().propertyName(propertyName).build(), requestOptions)

    /** @see get */
    fun get(params: PropertyGetParams): CompletableFuture<BaseProperty> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PropertyGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BaseProperty>

    /**
     * A view of [PropertyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PropertyServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        fun groups(): GroupServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/properties/2026-03/{objectType}`, but is
         * otherwise the same as [PropertyServiceAsync.create].
         */
        fun create(
            objectType: String,
            params: PropertyCreateParams,
        ): CompletableFuture<HttpResponseFor<BaseProperty>> =
            create(objectType, params, RequestOptions.none())

        /** @see create */
        fun create(
            objectType: String,
            params: PropertyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BaseProperty>> =
            create(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see create */
        fun create(params: PropertyCreateParams): CompletableFuture<HttpResponseFor<BaseProperty>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PropertyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BaseProperty>>

        /**
         * Returns a raw HTTP response for `patch
         * /crm/properties/2026-03/{objectType}/{propertyName}`, but is otherwise the same as
         * [PropertyServiceAsync.update].
         */
        fun update(
            propertyName: String,
            params: PropertyUpdateParams,
        ): CompletableFuture<HttpResponseFor<BaseProperty>> =
            update(propertyName, params, RequestOptions.none())

        /** @see update */
        fun update(
            propertyName: String,
            params: PropertyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BaseProperty>> =
            update(params.toBuilder().propertyName(propertyName).build(), requestOptions)

        /** @see update */
        fun update(params: PropertyUpdateParams): CompletableFuture<HttpResponseFor<BaseProperty>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PropertyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BaseProperty>>

        /**
         * Returns a raw HTTP response for `get /crm/properties/2026-03/{objectType}`, but is
         * otherwise the same as [PropertyServiceAsync.list].
         */
        fun list(
            objectType: String
        ): CompletableFuture<HttpResponseFor<CollectionResponsePropertyNoPaging>> =
            list(objectType, PropertyListParams.none())

        /** @see list */
        fun list(
            objectType: String,
            params: PropertyListParams = PropertyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePropertyNoPaging>> =
            list(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see list */
        fun list(
            objectType: String,
            params: PropertyListParams = PropertyListParams.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePropertyNoPaging>> =
            list(objectType, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: PropertyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePropertyNoPaging>>

        /** @see list */
        fun list(
            params: PropertyListParams
        ): CompletableFuture<HttpResponseFor<CollectionResponsePropertyNoPaging>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            objectType: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponsePropertyNoPaging>> =
            list(objectType, PropertyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /crm/properties/2026-03/{objectType}/{propertyName}`, but is otherwise the same as
         * [PropertyServiceAsync.delete].
         */
        fun delete(
            propertyName: String,
            params: PropertyDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(propertyName, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            propertyName: String,
            params: PropertyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().propertyName(propertyName).build(), requestOptions)

        /** @see delete */
        fun delete(params: PropertyDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PropertyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /crm/properties/2026-03/{objectType}/{propertyName}`, but is otherwise the same as
         * [PropertyServiceAsync.get].
         */
        fun get(
            propertyName: String,
            params: PropertyGetParams,
        ): CompletableFuture<HttpResponseFor<BaseProperty>> =
            get(propertyName, params, RequestOptions.none())

        /** @see get */
        fun get(
            propertyName: String,
            params: PropertyGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BaseProperty>> =
            get(params.toBuilder().propertyName(propertyName).build(), requestOptions)

        /** @see get */
        fun get(params: PropertyGetParams): CompletableFuture<HttpResponseFor<BaseProperty>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: PropertyGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BaseProperty>>
    }
}
