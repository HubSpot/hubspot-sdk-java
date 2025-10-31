// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.CreatedResponseSimplePublicObject
import com.hubspot_sdk.api.models.crm.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.postalmail.PostalMailCreateParams
import com.hubspot_sdk.api.models.crm.objects.postalmail.PostalMailDeleteParams
import com.hubspot_sdk.api.models.crm.objects.postalmail.PostalMailGetParams
import com.hubspot_sdk.api.models.crm.objects.postalmail.PostalMailListPageAsync
import com.hubspot_sdk.api.models.crm.objects.postalmail.PostalMailListParams
import com.hubspot_sdk.api.models.crm.objects.postalmail.PostalMailSearchParams
import com.hubspot_sdk.api.models.crm.objects.postalmail.PostalMailUpdateParams
import com.hubspot_sdk.api.services.async.crm.objects.postalmail.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PostalMailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PostalMailServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Create a postal mail with the given properties and return a copy of the object, including the
     * ID. Documentation and examples for creating standard postal mail is provided.
     */
    fun create(
        params: PostalMailCreateParams
    ): CompletableFuture<CreatedResponseSimplePublicObject> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PostalMailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreatedResponseSimplePublicObject>

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreatedResponseSimplePublicObject> =
        create(
            PostalMailCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): CompletableFuture<CreatedResponseSimplePublicObject> =
        create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{postalMailId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{postalMailId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(
        postalMailId: String,
        params: PostalMailUpdateParams,
    ): CompletableFuture<SimplePublicObject> = update(postalMailId, params, RequestOptions.none())

    /** @see update */
    fun update(
        postalMailId: String,
        params: PostalMailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().postalMailId(postalMailId).build(), requestOptions)

    /** @see update */
    fun update(params: PostalMailUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PostalMailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** Read a page of postal mail. Control what is returned via the `properties` query param. */
    fun list(): CompletableFuture<PostalMailListPageAsync> = list(PostalMailListParams.none())

    /** @see list */
    fun list(
        params: PostalMailListParams = PostalMailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PostalMailListPageAsync>

    /** @see list */
    fun list(
        params: PostalMailListParams = PostalMailListParams.none()
    ): CompletableFuture<PostalMailListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PostalMailListPageAsync> =
        list(PostalMailListParams.none(), requestOptions)

    /** Move an Object identified by `{postalMailId}` to the recycling bin. */
    fun delete(postalMailId: String): CompletableFuture<Void?> =
        delete(postalMailId, PostalMailDeleteParams.none())

    /** @see delete */
    fun delete(
        postalMailId: String,
        params: PostalMailDeleteParams = PostalMailDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().postalMailId(postalMailId).build(), requestOptions)

    /** @see delete */
    fun delete(
        postalMailId: String,
        params: PostalMailDeleteParams = PostalMailDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(postalMailId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PostalMailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: PostalMailDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(postalMailId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(postalMailId, PostalMailDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{postalMailId}`. `{postalMailId}` refers to the internal object
     * ID by default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(postalMailId: String): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(postalMailId, PostalMailGetParams.none())

    /** @see get */
    fun get(
        postalMailId: String,
        params: PostalMailGetParams = PostalMailGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().postalMailId(postalMailId).build(), requestOptions)

    /** @see get */
    fun get(
        postalMailId: String,
        params: PostalMailGetParams = PostalMailGetParams.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(postalMailId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PostalMailGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /** @see get */
    fun get(params: PostalMailGetParams): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        postalMailId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(postalMailId, PostalMailGetParams.none(), requestOptions)

    fun search(
        params: PostalMailSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: PostalMailSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            PostalMailSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(publicObjectSearchRequest, RequestOptions.none())

    /**
     * A view of [PostalMailServiceAsync] that provides access to raw HTTP responses for each
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
        ): PostalMailServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/postal_mail`, but is otherwise the
         * same as [PostalMailServiceAsync.create].
         */
        fun create(
            params: PostalMailCreateParams
        ): CompletableFuture<HttpResponseFor<CreatedResponseSimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PostalMailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreatedResponseSimplePublicObject>>

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreatedResponseSimplePublicObject>> =
            create(
                PostalMailCreateParams.builder()
                    .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
        ): CompletableFuture<HttpResponseFor<CreatedResponseSimplePublicObject>> =
            create(simplePublicObjectInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm/v3/objects/postal_mail/{postalMailId}`, but
         * is otherwise the same as [PostalMailServiceAsync.update].
         */
        fun update(
            postalMailId: String,
            params: PostalMailUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(postalMailId, params, RequestOptions.none())

        /** @see update */
        fun update(
            postalMailId: String,
            params: PostalMailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().postalMailId(postalMailId).build(), requestOptions)

        /** @see update */
        fun update(
            params: PostalMailUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PostalMailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/postal_mail`, but is otherwise the
         * same as [PostalMailServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PostalMailListPageAsync>> =
            list(PostalMailListParams.none())

        /** @see list */
        fun list(
            params: PostalMailListParams = PostalMailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PostalMailListPageAsync>>

        /** @see list */
        fun list(
            params: PostalMailListParams = PostalMailListParams.none()
        ): CompletableFuture<HttpResponseFor<PostalMailListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PostalMailListPageAsync>> =
            list(PostalMailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/v3/objects/postal_mail/{postalMailId}`, but
         * is otherwise the same as [PostalMailServiceAsync.delete].
         */
        fun delete(postalMailId: String): CompletableFuture<HttpResponse> =
            delete(postalMailId, PostalMailDeleteParams.none())

        /** @see delete */
        fun delete(
            postalMailId: String,
            params: PostalMailDeleteParams = PostalMailDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().postalMailId(postalMailId).build(), requestOptions)

        /** @see delete */
        fun delete(
            postalMailId: String,
            params: PostalMailDeleteParams = PostalMailDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(postalMailId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PostalMailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: PostalMailDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            postalMailId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(postalMailId, PostalMailDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/postal_mail/{postalMailId}`, but is
         * otherwise the same as [PostalMailServiceAsync.get].
         */
        fun get(
            postalMailId: String
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(postalMailId, PostalMailGetParams.none())

        /** @see get */
        fun get(
            postalMailId: String,
            params: PostalMailGetParams = PostalMailGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().postalMailId(postalMailId).build(), requestOptions)

        /** @see get */
        fun get(
            postalMailId: String,
            params: PostalMailGetParams = PostalMailGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(postalMailId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: PostalMailGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /** @see get */
        fun get(
            params: PostalMailGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            postalMailId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(postalMailId, PostalMailGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/postal_mail/search`, but is
         * otherwise the same as [PostalMailServiceAsync.search].
         */
        fun search(
            params: PostalMailSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: PostalMailSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                PostalMailSearchParams.builder()
                    .publicObjectSearchRequest(publicObjectSearchRequest)
                    .build(),
                requestOptions,
            )

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(publicObjectSearchRequest, RequestOptions.none())
    }
}
