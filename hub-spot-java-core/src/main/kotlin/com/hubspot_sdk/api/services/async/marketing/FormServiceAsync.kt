// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.forms.FormCreateParams
import com.hubspot_sdk.api.models.marketing.forms.FormDefinitionBase
import com.hubspot_sdk.api.models.marketing.forms.FormDefinitionCreateRequestBase
import com.hubspot_sdk.api.models.marketing.forms.FormDeleteParams
import com.hubspot_sdk.api.models.marketing.forms.FormGetParams
import com.hubspot_sdk.api.models.marketing.forms.FormListPageAsync
import com.hubspot_sdk.api.models.marketing.forms.FormListParams
import com.hubspot_sdk.api.models.marketing.forms.FormReplaceParams
import com.hubspot_sdk.api.models.marketing.forms.FormUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FormServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FormServiceAsync

    /** Add a new `hubspot` form */
    fun create(params: FormCreateParams): CompletableFuture<FormDefinitionBase> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FormCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FormDefinitionBase>

    /** @see create */
    fun create(
        formDefinitionCreateRequestBase: FormDefinitionCreateRequestBase,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FormDefinitionBase> =
        create(
            FormCreateParams.builder()
                .formDefinitionCreateRequestBase(formDefinitionCreateRequestBase)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        formDefinitionCreateRequestBase: FormDefinitionCreateRequestBase
    ): CompletableFuture<FormDefinitionBase> =
        create(formDefinitionCreateRequestBase, RequestOptions.none())

    /** Update some of the form definition components */
    fun update(formId: String, params: FormUpdateParams): CompletableFuture<FormDefinitionBase> =
        update(formId, params, RequestOptions.none())

    /** @see update */
    fun update(
        formId: String,
        params: FormUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FormDefinitionBase> =
        update(params.toBuilder().formId(formId).build(), requestOptions)

    /** @see update */
    fun update(params: FormUpdateParams): CompletableFuture<FormDefinitionBase> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FormUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FormDefinitionBase>

    /**
     * Returns a list of forms based on the search filters. By default, it returns the first 20
     * `hubspot` forms
     */
    fun list(): CompletableFuture<FormListPageAsync> = list(FormListParams.none())

    /** @see list */
    fun list(
        params: FormListParams = FormListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FormListPageAsync>

    /** @see list */
    fun list(params: FormListParams = FormListParams.none()): CompletableFuture<FormListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<FormListPageAsync> =
        list(FormListParams.none(), requestOptions)

    /**
     * Archive a form definition. New submissions will not be accepted and the form definition will
     * be permanently deleted after 3 months.
     */
    fun delete(formId: String): CompletableFuture<Void?> = delete(formId, FormDeleteParams.none())

    /** @see delete */
    fun delete(
        formId: String,
        params: FormDeleteParams = FormDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().formId(formId).build(), requestOptions)

    /** @see delete */
    fun delete(
        formId: String,
        params: FormDeleteParams = FormDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(formId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FormDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: FormDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(formId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(formId, FormDeleteParams.none(), requestOptions)

    /** Returns a form based on the form ID provided. */
    fun get(formId: String): CompletableFuture<FormDefinitionBase> =
        get(formId, FormGetParams.none())

    /** @see get */
    fun get(
        formId: String,
        params: FormGetParams = FormGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FormDefinitionBase> =
        get(params.toBuilder().formId(formId).build(), requestOptions)

    /** @see get */
    fun get(
        formId: String,
        params: FormGetParams = FormGetParams.none(),
    ): CompletableFuture<FormDefinitionBase> = get(formId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: FormGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FormDefinitionBase>

    /** @see get */
    fun get(params: FormGetParams): CompletableFuture<FormDefinitionBase> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(formId: String, requestOptions: RequestOptions): CompletableFuture<FormDefinitionBase> =
        get(formId, FormGetParams.none(), requestOptions)

    /** Update all fields of a hubspot form definition. */
    fun replace(formId: String, params: FormReplaceParams): CompletableFuture<FormDefinitionBase> =
        replace(formId, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        formId: String,
        params: FormReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FormDefinitionBase> =
        replace(params.toBuilder().formId(formId).build(), requestOptions)

    /** @see replace */
    fun replace(params: FormReplaceParams): CompletableFuture<FormDefinitionBase> =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: FormReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FormDefinitionBase>

    /** A view of [FormServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FormServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /marketing/v3/forms/`, but is otherwise the same as
         * [FormServiceAsync.create].
         */
        fun create(
            params: FormCreateParams
        ): CompletableFuture<HttpResponseFor<FormDefinitionBase>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: FormCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FormDefinitionBase>>

        /** @see create */
        fun create(
            formDefinitionCreateRequestBase: FormDefinitionCreateRequestBase,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FormDefinitionBase>> =
            create(
                FormCreateParams.builder()
                    .formDefinitionCreateRequestBase(formDefinitionCreateRequestBase)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            formDefinitionCreateRequestBase: FormDefinitionCreateRequestBase
        ): CompletableFuture<HttpResponseFor<FormDefinitionBase>> =
            create(formDefinitionCreateRequestBase, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /marketing/v3/forms/{formId}`, but is otherwise
         * the same as [FormServiceAsync.update].
         */
        fun update(
            formId: String,
            params: FormUpdateParams,
        ): CompletableFuture<HttpResponseFor<FormDefinitionBase>> =
            update(formId, params, RequestOptions.none())

        /** @see update */
        fun update(
            formId: String,
            params: FormUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FormDefinitionBase>> =
            update(params.toBuilder().formId(formId).build(), requestOptions)

        /** @see update */
        fun update(
            params: FormUpdateParams
        ): CompletableFuture<HttpResponseFor<FormDefinitionBase>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: FormUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FormDefinitionBase>>

        /**
         * Returns a raw HTTP response for `get /marketing/v3/forms/`, but is otherwise the same as
         * [FormServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<FormListPageAsync>> =
            list(FormListParams.none())

        /** @see list */
        fun list(
            params: FormListParams = FormListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FormListPageAsync>>

        /** @see list */
        fun list(
            params: FormListParams = FormListParams.none()
        ): CompletableFuture<HttpResponseFor<FormListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<FormListPageAsync>> =
            list(FormListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /marketing/v3/forms/{formId}`, but is otherwise
         * the same as [FormServiceAsync.delete].
         */
        fun delete(formId: String): CompletableFuture<HttpResponse> =
            delete(formId, FormDeleteParams.none())

        /** @see delete */
        fun delete(
            formId: String,
            params: FormDeleteParams = FormDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().formId(formId).build(), requestOptions)

        /** @see delete */
        fun delete(
            formId: String,
            params: FormDeleteParams = FormDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(formId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: FormDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: FormDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            formId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> = delete(formId, FormDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /marketing/v3/forms/{formId}`, but is otherwise the
         * same as [FormServiceAsync.get].
         */
        fun get(formId: String): CompletableFuture<HttpResponseFor<FormDefinitionBase>> =
            get(formId, FormGetParams.none())

        /** @see get */
        fun get(
            formId: String,
            params: FormGetParams = FormGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FormDefinitionBase>> =
            get(params.toBuilder().formId(formId).build(), requestOptions)

        /** @see get */
        fun get(
            formId: String,
            params: FormGetParams = FormGetParams.none(),
        ): CompletableFuture<HttpResponseFor<FormDefinitionBase>> =
            get(formId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: FormGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FormDefinitionBase>>

        /** @see get */
        fun get(params: FormGetParams): CompletableFuture<HttpResponseFor<FormDefinitionBase>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            formId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FormDefinitionBase>> =
            get(formId, FormGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /marketing/v3/forms/{formId}`, but is otherwise the
         * same as [FormServiceAsync.replace].
         */
        fun replace(
            formId: String,
            params: FormReplaceParams,
        ): CompletableFuture<HttpResponseFor<FormDefinitionBase>> =
            replace(formId, params, RequestOptions.none())

        /** @see replace */
        fun replace(
            formId: String,
            params: FormReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FormDefinitionBase>> =
            replace(params.toBuilder().formId(formId).build(), requestOptions)

        /** @see replace */
        fun replace(
            params: FormReplaceParams
        ): CompletableFuture<HttpResponseFor<FormDefinitionBase>> =
            replace(params, RequestOptions.none())

        /** @see replace */
        fun replace(
            params: FormReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FormDefinitionBase>>
    }
}
