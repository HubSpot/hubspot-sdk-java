// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.mediabridge

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.BatchResponseProperty
import com.hubspot_sdk.api.models.Property
import com.hubspot_sdk.api.models.cms.mediabridge.CollectionResponsePropertyNoPaging
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyCreateBatchParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyCreateParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyDeleteBatchParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyDeleteParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyGetBatchParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyGetParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyListParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyUpdateParams
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

    /** Create a new property for the specified media type */
    fun create(objectType: String, params: PropertyCreateParams): CompletableFuture<Property> =
        create(objectType, params, RequestOptions.none())

    /** @see create */
    fun create(
        objectType: String,
        params: PropertyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Property> =
        create(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see create */
    fun create(params: PropertyCreateParams): CompletableFuture<Property> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PropertyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Property>

    /** Update an existing property for an object type. */
    fun update(propertyName: String, params: PropertyUpdateParams): CompletableFuture<Property> =
        update(propertyName, params, RequestOptions.none())

    /** @see update */
    fun update(
        propertyName: String,
        params: PropertyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Property> =
        update(params.toBuilder().propertyName(propertyName).build(), requestOptions)

    /** @see update */
    fun update(params: PropertyUpdateParams): CompletableFuture<Property> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PropertyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Property>

    /** Get the existing properties defined for a media object type. */
    fun list(
        objectType: String,
        params: PropertyListParams,
    ): CompletableFuture<CollectionResponsePropertyNoPaging> =
        list(objectType, params, RequestOptions.none())

    /** @see list */
    fun list(
        objectType: String,
        params: PropertyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePropertyNoPaging> =
        list(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see list */
    fun list(params: PropertyListParams): CompletableFuture<CollectionResponsePropertyNoPaging> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PropertyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePropertyNoPaging>

    /** Delete an existing property for an object type. */
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

    /** Create a batch of properties of the specified object type. */
    fun createBatch(
        objectType: String,
        params: PropertyCreateBatchParams,
    ): CompletableFuture<BatchResponseProperty> =
        createBatch(objectType, params, RequestOptions.none())

    /** @see createBatch */
    fun createBatch(
        objectType: String,
        params: PropertyCreateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseProperty> =
        createBatch(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see createBatch */
    fun createBatch(params: PropertyCreateBatchParams): CompletableFuture<BatchResponseProperty> =
        createBatch(params, RequestOptions.none())

    /** @see createBatch */
    fun createBatch(
        params: PropertyCreateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseProperty>

    /** Archive a batch of existing properties for the specified types. */
    fun deleteBatch(
        objectType: String,
        params: PropertyDeleteBatchParams,
    ): CompletableFuture<Void?> = deleteBatch(objectType, params, RequestOptions.none())

    /** @see deleteBatch */
    fun deleteBatch(
        objectType: String,
        params: PropertyDeleteBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteBatch(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see deleteBatch */
    fun deleteBatch(params: PropertyDeleteBatchParams): CompletableFuture<Void?> =
        deleteBatch(params, RequestOptions.none())

    /** @see deleteBatch */
    fun deleteBatch(
        params: PropertyDeleteBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get the details for an existing property by name. */
    fun get(propertyName: String, params: PropertyGetParams): CompletableFuture<Property> =
        get(propertyName, params, RequestOptions.none())

    /** @see get */
    fun get(
        propertyName: String,
        params: PropertyGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Property> =
        get(params.toBuilder().propertyName(propertyName).build(), requestOptions)

    /** @see get */
    fun get(params: PropertyGetParams): CompletableFuture<Property> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PropertyGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Property>

    /** Get the details for a batch of properties for a specified object type. */
    fun getBatch(
        objectType: String,
        params: PropertyGetBatchParams,
    ): CompletableFuture<BatchResponseProperty> =
        getBatch(objectType, params, RequestOptions.none())

    /** @see getBatch */
    fun getBatch(
        objectType: String,
        params: PropertyGetBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseProperty> =
        getBatch(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see getBatch */
    fun getBatch(params: PropertyGetBatchParams): CompletableFuture<BatchResponseProperty> =
        getBatch(params, RequestOptions.none())

    /** @see getBatch */
    fun getBatch(
        params: PropertyGetBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseProperty>

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

        /**
         * Returns a raw HTTP response for `post /media-bridge/v1/{appId}/properties/{objectType}`,
         * but is otherwise the same as [PropertyServiceAsync.create].
         */
        fun create(
            objectType: String,
            params: PropertyCreateParams,
        ): CompletableFuture<HttpResponseFor<Property>> =
            create(objectType, params, RequestOptions.none())

        /** @see create */
        fun create(
            objectType: String,
            params: PropertyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Property>> =
            create(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see create */
        fun create(params: PropertyCreateParams): CompletableFuture<HttpResponseFor<Property>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PropertyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Property>>

        /**
         * Returns a raw HTTP response for `patch
         * /media-bridge/v1/{appId}/properties/{objectType}/{propertyName}`, but is otherwise the
         * same as [PropertyServiceAsync.update].
         */
        fun update(
            propertyName: String,
            params: PropertyUpdateParams,
        ): CompletableFuture<HttpResponseFor<Property>> =
            update(propertyName, params, RequestOptions.none())

        /** @see update */
        fun update(
            propertyName: String,
            params: PropertyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Property>> =
            update(params.toBuilder().propertyName(propertyName).build(), requestOptions)

        /** @see update */
        fun update(params: PropertyUpdateParams): CompletableFuture<HttpResponseFor<Property>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PropertyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Property>>

        /**
         * Returns a raw HTTP response for `get /media-bridge/v1/{appId}/properties/{objectType}`,
         * but is otherwise the same as [PropertyServiceAsync.list].
         */
        fun list(
            objectType: String,
            params: PropertyListParams,
        ): CompletableFuture<HttpResponseFor<CollectionResponsePropertyNoPaging>> =
            list(objectType, params, RequestOptions.none())

        /** @see list */
        fun list(
            objectType: String,
            params: PropertyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePropertyNoPaging>> =
            list(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see list */
        fun list(
            params: PropertyListParams
        ): CompletableFuture<HttpResponseFor<CollectionResponsePropertyNoPaging>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: PropertyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePropertyNoPaging>>

        /**
         * Returns a raw HTTP response for `delete
         * /media-bridge/v1/{appId}/properties/{objectType}/{propertyName}`, but is otherwise the
         * same as [PropertyServiceAsync.delete].
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
         * Returns a raw HTTP response for `post
         * /media-bridge/v1/{appId}/properties/{objectType}/batch/create`, but is otherwise the same
         * as [PropertyServiceAsync.createBatch].
         */
        fun createBatch(
            objectType: String,
            params: PropertyCreateBatchParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseProperty>> =
            createBatch(objectType, params, RequestOptions.none())

        /** @see createBatch */
        fun createBatch(
            objectType: String,
            params: PropertyCreateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseProperty>> =
            createBatch(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see createBatch */
        fun createBatch(
            params: PropertyCreateBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponseProperty>> =
            createBatch(params, RequestOptions.none())

        /** @see createBatch */
        fun createBatch(
            params: PropertyCreateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseProperty>>

        /**
         * Returns a raw HTTP response for `post
         * /media-bridge/v1/{appId}/properties/{objectType}/batch/archive`, but is otherwise the
         * same as [PropertyServiceAsync.deleteBatch].
         */
        fun deleteBatch(
            objectType: String,
            params: PropertyDeleteBatchParams,
        ): CompletableFuture<HttpResponse> = deleteBatch(objectType, params, RequestOptions.none())

        /** @see deleteBatch */
        fun deleteBatch(
            objectType: String,
            params: PropertyDeleteBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteBatch(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see deleteBatch */
        fun deleteBatch(params: PropertyDeleteBatchParams): CompletableFuture<HttpResponse> =
            deleteBatch(params, RequestOptions.none())

        /** @see deleteBatch */
        fun deleteBatch(
            params: PropertyDeleteBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /media-bridge/v1/{appId}/properties/{objectType}/{propertyName}`, but is otherwise the
         * same as [PropertyServiceAsync.get].
         */
        fun get(
            propertyName: String,
            params: PropertyGetParams,
        ): CompletableFuture<HttpResponseFor<Property>> =
            get(propertyName, params, RequestOptions.none())

        /** @see get */
        fun get(
            propertyName: String,
            params: PropertyGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Property>> =
            get(params.toBuilder().propertyName(propertyName).build(), requestOptions)

        /** @see get */
        fun get(params: PropertyGetParams): CompletableFuture<HttpResponseFor<Property>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: PropertyGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Property>>

        /**
         * Returns a raw HTTP response for `post
         * /media-bridge/v1/{appId}/properties/{objectType}/batch/read`, but is otherwise the same
         * as [PropertyServiceAsync.getBatch].
         */
        fun getBatch(
            objectType: String,
            params: PropertyGetBatchParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseProperty>> =
            getBatch(objectType, params, RequestOptions.none())

        /** @see getBatch */
        fun getBatch(
            objectType: String,
            params: PropertyGetBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseProperty>> =
            getBatch(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see getBatch */
        fun getBatch(
            params: PropertyGetBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponseProperty>> =
            getBatch(params, RequestOptions.none())

        /** @see getBatch */
        fun getBatch(
            params: PropertyGetBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseProperty>>
    }
}
