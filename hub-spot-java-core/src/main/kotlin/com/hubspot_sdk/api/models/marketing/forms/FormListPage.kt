// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.services.blocking.marketing.FormService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see FormService.list */
class FormListPage
private constructor(
    private val service: FormService,
    private val params: FormListParams,
    private val response: CollectionResponseFormDefinitionBaseForwardPaging,
) : Page<HubSpotFormDefinition> {

    /**
     * Delegates to [CollectionResponseFormDefinitionBaseForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseFormDefinitionBaseForwardPaging.results
     */
    fun results(): List<HubSpotFormDefinition> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseFormDefinitionBaseForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseFormDefinitionBaseForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<HubSpotFormDefinition> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): FormListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): FormListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<HubSpotFormDefinition> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FormListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseFormDefinitionBaseForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FormListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FormListPage]. */
    class Builder internal constructor() {

        private var service: FormService? = null
        private var params: FormListParams? = null
        private var response: CollectionResponseFormDefinitionBaseForwardPaging? = null

        @JvmSynthetic
        internal fun from(formListPage: FormListPage) = apply {
            service = formListPage.service
            params = formListPage.params
            response = formListPage.response
        }

        fun service(service: FormService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FormListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseFormDefinitionBaseForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [FormListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FormListPage =
            FormListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FormListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "FormListPage{service=$service, params=$params, response=$response}"
}
